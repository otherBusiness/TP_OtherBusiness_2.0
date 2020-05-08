package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import pe.edu.upc.daointerface.IuserDao;
import pe.edu.upc.entity.Users;

@Named
//@RequestScoped
public class UserDaoImpl implements IuserDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "OtherBusiness")
	private EntityManager em;

	@Override
	public Integer insert(Users t) throws Exception {
		em.persist(t);
		return t.getCustomer().getId();//.getId();
	}

	@Override
	public Integer update(Users t) throws Exception {
		em.merge(t);
		return t.getCustomer().getId();
	}

	@Override
	public Integer delete(Users t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> findAll() throws Exception {
		List<Users> users = new ArrayList<>();

		Query query = em.createQuery("SELECT c FROM Users c");////s                      //SELECT u FROM User u
		users = (List<Users>) query.getResultList();

		return users;
	}

	@Override
	public Optional<Users> findById(Users t) throws Exception {

		Users user;
		TypedQuery<Users> query = em.createQuery("SELECT u FROM Users u WHERE u.id = ?1", Users.class);//s     User
		query.setParameter(1, t.getCustomer().getId());

		user = query.getSingleResult();

		return Optional.of(user);
	}

	@Override
	public String getPassworHashedByUserName(String username) throws Exception {
		Users user = new Users();

		try {

			Query query = em.createQuery("FROM Users u WHERE u.usernameUser = ?1");//s    - ---  username
			query.setParameter(1, username);
			@SuppressWarnings("unchecked")
			List<Users> lista = query.getResultList();
			if (!lista.isEmpty()) {
				user = lista.get(0);
			}
		} catch (Exception e) {
			throw e;
		}

		return user != null ? user.getPasswordUser() : ""; //.getPassword()
	}

	@Override
	public Optional<Users> findUserByUsername(Users user) throws Exception {
		
		Users userFound;
		TypedQuery<Users> query = em.createQuery("FROM Users u WHERE u.usernameUser = ?1 and u.passwordUser = ?2", Users.class);//user --- 
		query.setParameter(1, user.getUsernameUser());
		query.setParameter(2, user.getPasswordUser());

		userFound = query.getSingleResult();

		return Optional.of(userFound);
	}

}
