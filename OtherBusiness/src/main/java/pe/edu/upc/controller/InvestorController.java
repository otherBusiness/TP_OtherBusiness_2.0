package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Investor;
import pe.edu.upc.serviceinterface.IinvestorService;

@Named
@RequestScoped
public class InvestorController implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Inject
	private IinvestorService iService;
	
	private Investor i;
	
	List<Investor> listaInvestor;
	
	@PostConstruct
	public void init() {
		this.listaInvestor = new ArrayList<Investor>();
		this.i = new Investor();
		this.list();
	}
	
	public String newInvestor() {
		this.setI(new Investor());
		return "Investor.xhtml";
	}

	
	public void insert() {
		try {
			iService.insert(i);
			cleanInvestor();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void modificar() {
		try {
			iService.modificar(this.i);
			cleanInvestor();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void delete(Investor ia) {
		try {
			iService.delete(ia.getIdInvestor());
			list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void list() {
		try {
			listaInvestor = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public String Modifpre(Investor ia) {
		this.setI(ia);
		return "InvestorMod.xhtml";
	}
	public void cleanInvestor() {
		this.init();
	}

	public Investor getI() {
		return i;
	}

	public void setI(Investor i) {
		this.i = i;
	}

	public List<Investor> getListaInvestor() {
		return listaInvestor;
	}

	public void setListaInvestor(List<Investor> listaInvestor) {
		this.listaInvestor = listaInvestor;
	}
	
	
}
