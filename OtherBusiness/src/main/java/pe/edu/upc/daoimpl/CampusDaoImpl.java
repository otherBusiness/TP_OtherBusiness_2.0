package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.IcampusDao;
import pe.edu.upc.entity.Campus;

public class CampusDaoImpl implements Serializable, IcampusDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "OtherBusiness")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Campus> list() {
		// TODO Auto-generated method stub
		List<Campus> lista = new ArrayList<Campus>();
		try {
			Query q = em.createQuery("from Campus t");
			lista = (List<Campus>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Campus en el DaoImpl");
		}
		return lista;
	}

	
}
