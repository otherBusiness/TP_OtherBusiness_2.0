package pe.edu.upc.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Rol;
import pe.edu.upc.entity.Users;
import pe.edu.upc.entity.UserRol;

public interface IrolServiceImpl {

	
	//public void insert(Rol rol);
	//public List<Rol>list();
	
	Integer insert(Rol rol) throws Exception;

	Integer update(Rol rol) throws Exception;

	Integer delete(Rol rol) throws Exception;

	List<Rol> getAll() throws Exception;

	Optional<Rol> getOne(Rol rol) throws Exception;

	Integer assignRolesToUser(Users user, List<Rol> roles) throws Exception;

	List<UserRol> findUserRolesByUser(Users user) throws Exception;
}

