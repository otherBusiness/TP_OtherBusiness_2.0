package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Users;

public interface IuserService {
	//Optional<Users> getOne(Users user) throws Exception;

	//Optional<Users> authentication(Users us) throws Exception;
	
	//List<Users> getAll() throws Exception;
	
	public void insert(Users user);

	//
	public List<Users> list();

	//
	public void delete(int idUser);

	//
	public void modificar(Users u);
	
	//buscarXname
	public List<Users> finByNameUsers(Users u);
}

