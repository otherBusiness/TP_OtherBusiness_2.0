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

import pe.edu.upc.daointerface.IrolDao;
import pe.edu.upc.entity.Rol;

@Named
@RequestScoped
public class RolDaoImpl implements IrolDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "OtherBusiness")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Rol rol) {
		try {
			em.persist(rol);
		} catch (Exception e) {
			System.out.println("Error al insertar un ROL");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> list() {
		List<Rol> lista = new ArrayList<Rol>();
		try {
			Query q = em.createQuery("select i from Rol i");
			lista = (List<Rol>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
		
	}

	
}
