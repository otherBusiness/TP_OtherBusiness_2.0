package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.IcategoryDao;
import pe.edu.upc.entity.Category;

public class CategoryDaoImpl implements Serializable, IcategoryDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "OtherBusiness")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		List<Category> lista = new ArrayList<Category>();
		try {
			Query q = em.createQuery("from Category t");
			lista = (List<Category>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Category en el DaoImpl");
		}
		return lista;
	}

}
