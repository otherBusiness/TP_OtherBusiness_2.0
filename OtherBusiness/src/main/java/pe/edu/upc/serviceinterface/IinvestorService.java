package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Investor;

public interface IinvestorService {

	public void insert(Investor ia);

	public void modificar(Investor ia);

	public void delete(int idInvestor);

	public List<Investor> list(); 
}
