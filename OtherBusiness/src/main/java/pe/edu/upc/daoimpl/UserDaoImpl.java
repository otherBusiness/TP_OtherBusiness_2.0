package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IuserDao;
import pe.edu.upc.entity.Users;

@Named
@RequestScoped
public class UserDaoImpl implements IuserDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "OtherBusiness")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Users user) {
		try {
			

			em.persist(user);

		} catch (Exception e) {
			System.out.println("Error al crear nuevo usuario ");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> list() {
		List<Users> lista = new ArrayList<Users>();
		try {

			Query q = em.createQuery("select i from Users i");
			lista = (List<Users>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar nuevo usuario");
		}

		return lista;
	}
	
	@Transactional
	@Override
	public void delete(int idUser) 
	{
		// TODO Auto-generated method stub
		Users u=new Users();
		try {
			u=em.getReference(Users.class, idUser);
			em.remove(u);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}

	@Transactional  //permite modificar la base de datos
	@Override
	public void modificar(Users u) {
		// TODO Auto-generated method stub
		try {
			em.merge(u);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		}
	}

	//buscarXname
	@SuppressWarnings("unchecked")
	@Override
	public List<Users> finByNameUsers(Users u){
		List<Users> lista = new ArrayList<Users>();
		try {
			Query q = em.createQuery("from Users i where i.usernameUser like ?1");////--------------------------
			q.setParameter(1, "%" + u.getUsernameUser()+ "%");//.getDescriptionInfectiousAgents() + "%");
			lista = (List<Users>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
		
	}
	
	/*
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<Users> findAll() throws Exception {
	 * 
	 * }
	 */

}
