package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.entity.Category;
import pe.edu.upc.serviceinterface.IcategoryService;

public class CategoryController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IcategoryService caService;

List<Category> listaCategory;
	
	//Metodo
	public void list() {
		try {
			listaCategory = caService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public IcategoryService getCaService() {
		return caService;
	}

	public void setCaService(IcategoryService caService) {
		this.caService = caService;
	}

	public List<Category> getListaCategory() {
		return listaCategory;
	}

	public void setListaCategory(List<Category> listaCategory) {
		this.listaCategory = listaCategory;
	}
	
}
