package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IuserDao;
import pe.edu.upc.entity.Users;
import pe.edu.upc.serviceinterface.IuserService;

@Named
@RequestScoped
public class UserServiceImpl implements IuserService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject /* inyeccion de dependencia */
	private IuserDao ID;
	
	public void insert(Users user) {
		try {
			ID.insert(user);
		} catch (Exception e) {
			System.out.println("Error al listar nuevo usuario");
		}
		
	}

	public List<Users> list() {
		return ID.list();
	}

	@Override
	public void delete(int idUser) {
		// TODO Auto-generated method stub
		ID.delete(idUser);
	}

	@Override
	public void modificar(Users u) {
		// TODO Auto-generated method stub
		ID.modificar(u);
	}
	
	//buscar
		@Override
		public List<Users> finByNameUsers(Users u) {
			// TODO Auto-generated method stub
			return ID.finByNameUsers(u);
		}
/*	@Override
	Optional<Users> getOne(Users user) throws Exception {
		return uD.findById(user);
	}
;
	@Override
	public Optional<Users> authentication(Users user) throws Exception {
		String password = user.getPasswordUser(); 

		String passwordHash = uD.getPassworHashedByUserName(user.getUsernameUser());

		if (BCrypt.checkpw(password, passwordHash)) 
				{
			user.setPasswordUser(passwordHash);
			return uD.findUserByUsername(user);
		}

		return Optional.of(new Users());
	}*/
}
