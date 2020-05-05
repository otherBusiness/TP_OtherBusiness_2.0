package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IstudentDao;
import pe.edu.upc.entity.Student;

public class StundentDaoImpl implements IstudentDao, Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "OtherBusiness")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		try {
			em.persist(student);
		} catch (Exception e) {
			System.out.println("Error al insertar DAOImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		List<Student> lista = new ArrayList<Student>();
		try {
			Query q = em.createQuery("select i from Student i");
			lista=(List<Student>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar DAOImpl");
		}
		return lista;
	}

}
