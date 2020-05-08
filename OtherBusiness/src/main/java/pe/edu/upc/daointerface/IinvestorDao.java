package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Investor;

public interface IinvestorDao {

	public void insert(Investor p);

	public void modificar(Investor ia);
	
	public List<Investor> list();

	public void delete(int idInvestor);

}
