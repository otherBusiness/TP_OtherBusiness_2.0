package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Campus;
import pe.edu.upc.serviceinterface.IcampusService;

@Named
@RequestScoped
public class CampusController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IcampusService cService;
	
	List<Campus> listaCampus;
	
	//Metodo
	public void list() {
		try {
			listaCampus = cService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	//get y set
	public IcampusService getcService() {
		return cService;
	}

	public void setcService(IcampusService cService) {
		this.cService = cService;
	}

	public List<Campus> getListaCampus() {
		return listaCampus;
	}

	public void setListaCampus(List<Campus> listaCampus) {
		this.listaCampus = listaCampus;
	}
	
	
}
