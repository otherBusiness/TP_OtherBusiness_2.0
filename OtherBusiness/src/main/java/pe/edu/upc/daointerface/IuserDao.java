package pe.edu.upc.daointerface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.Users;

public interface IuserDao {

	/*public void insert(Users user);

	//
	public List<Users> list();

	//
	public void delete(int idUser);

	//
	public void modificar(Users u);

	
	//buscarXname
		public List<Users> finByNameUsers(Users u);
	// buscarXname
	//public List<Users> finByNameInfectiousAgent(Users u);

	// String getPassworHashedByUserName(String usernameUser) throws Exception;

//	Optional<Users> findUserByUsername(Users user) throws Exception;

//	Optional<Users> findById(Users user) throws Exception;
*/
		///-----
		
		Integer insert(Users user) throws Exception;

		Integer update(Users user) throws Exception;

		Integer delete(Users user) throws Exception;

		List<Users> findAll() throws Exception;

		Optional<Users> findById(Users user) throws Exception;

		String getPassworHashedByUserName(String username) throws Exception;

		Optional<Users> findUserByUsername(Users user) throws Exception;
}
