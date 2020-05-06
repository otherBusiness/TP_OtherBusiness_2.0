package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Project;
import pe.edu.upc.serviceinterface.IprojectService;

@Named
@RequestScoped
public class ProjectController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// variables
	@Inject
	private IprojectService iService;

	private Project i;
	List<Project> listaProject;

	// constructor
	@PostConstruct
	public void init() {
		this.listaProject = new ArrayList<Project>();
		this.i = new Project();
		this.list();
	}

	// Metodos
	public String newProject() {
		this.setI(new Project());
		return "project.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanProject();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaProject = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanProject() {
		this.init();
	}

	public IprojectService getiService() {
		return iService;
	}

	public void setiService(IprojectService iService) {
		this.iService = iService;
	}

	public Project getI() {
		return i;
	}

	public void setI(Project i) {
		this.i = i;
	}

	public List<Project> getListaProject() {
		return listaProject;
	}

	public void setListaProject(List<Project> listaProject) {
		this.listaProject = listaProject;
	}

	// getters y setters
	

}
