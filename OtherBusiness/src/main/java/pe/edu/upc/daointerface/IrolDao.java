package pe.edu.upc.daointerface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Rol;
import pe.edu.upc.entity.Users;
import pe.edu.upc.entity.UserRol;

public interface IrolDao {

	//public void insert(Rol rol);
	//public List<Rol>list();
	
	Integer insert(Rol rol) throws Exception;

	Integer update(Rol rol) throws Exception;

	Integer delete(Rol rol) throws Exception;

	List<Rol> findAll() throws Exception;

	Optional<Rol> findById(Rol rol) throws Exception;

	Integer insertUserRole(List<UserRol> userRoles) throws Exception;

	List<UserRol> findUserRolesByUser(Users user) throws Exception;
	
}
