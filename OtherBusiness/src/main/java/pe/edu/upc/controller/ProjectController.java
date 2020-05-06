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
	public String newInfectious() {
		this.setI(new Project());
		return "project.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanInfectiousAgent();
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

	public void cleanInfectiousAgent() {
		this.init();
	}

	// getters y setters
	public Project getI() {
		return i;
	}

	public void setI(Project i) {
		this.i = i;
	}

	public List<Project> getListaInfectiousAgent() {
		return listaProject;
	}

	public void setListaInfectiousAgent(List<Project> listaInfectiousAgent) {
		this.listaProject = listaInfectiousAgent;
	}

}
