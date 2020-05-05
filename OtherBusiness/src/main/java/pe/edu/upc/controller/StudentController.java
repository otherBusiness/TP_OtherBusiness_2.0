package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Student;
import pe.edu.upc.serviceinterface.IstudentService;

@Named
@RequestScoped
public class StudentController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Variables
	@Inject
	private IstudentService iService;
	
	private Student i;
	
	List<Student> listaStudent;

	// constructor
	@PostConstruct
	public void init() {
		this.listaStudent = new ArrayList<Student>();
		this.i = new Student();
		this.list();

	}

	// metodos
	public String newStudent() {
		this.setI(new Student());
		return "student.xhtml";
	}

	
	public void insert() {
		try {
			iService.insert(i);
			cleanStudent();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaStudent = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void cleanStudent() {
	this.init();
	}

	
	
	// getters y setters
	public IstudentService getiService() {
		return iService;
	}

	public void setiService(IstudentService iService) {
		this.iService = iService;
	}

	public Student getI() {
		return i;
	}

	public void setI(Student i) {
		this.i = i;
	}

	public List<Student> getListaStudent() {
		return listaStudent;
	}

	public void setListaStudent(List<Student> listaStudent) {
		this.listaStudent = listaStudent;
	}

}
