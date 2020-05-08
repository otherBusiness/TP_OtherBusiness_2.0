package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IinvestorDao;
import pe.edu.upc.entity.Investor;
import pe.edu.upc.serviceinterface.IinvestorService;

@Named
@RequestScoped
public class InvestorServiceImpl implements IinvestorService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private IinvestorDao iD;
	
	@Override
	public void insert(Investor ia) {
		try {
			iD.insert(ia);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un Inversor");	
		}
		
	}
	
	@Override
	public List<Investor> list() {
		return iD.list();
	}
	
	@Override
	public void delete(int idInvestor) {
		iD.delete(idInvestor);
	}
	
	@Override
	public void modificar(Investor ia) {
		iD.modificar(ia);
	}
}
