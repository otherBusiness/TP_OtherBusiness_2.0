package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.mindrot.jbcrypt.BCrypt;

import pe.edu.upc.daointerface.IuserDao;
import pe.edu.upc.entity.Users;
import pe.edu.upc.serviceinterface.IuserService;

@Named
@RequestScoped
public class UserServiceImpl implements IuserService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject /* inyeccion de dependencia */
	private IuserDao uD;

	@Transactional
	@Override
	public Integer insert(Users t) throws Exception {
		return uD.insert(t);
	}

	@Transactional
	@Override
	public Integer update(Users t) throws Exception {
		return uD.update(t);
	}

	@Transactional
	@Override
	public Integer delete(Users t) throws Exception {
		return uD.delete(t);
	}

	@Override
	public List<Users> getAll() throws Exception {
		return uD.findAll();
	}

	@Override
	public Optional<Users> getOne(Users t) throws Exception {
		return uD.findById(t);
	}

	@Override
	public Optional<Users> authentication(Users user) throws Exception {
		String password = user.getPasswordUser();

		String passwordHash = uD.getPassworHashedByUserName(user.getUsernameUser());//.getUsername()

		if (BCrypt.checkpw(password, passwordHash)) {
			user.setPasswordUser(passwordHash);
			return uD.findUserByUsername(user);
		}

		return Optional.of(new Users());
	}

}
