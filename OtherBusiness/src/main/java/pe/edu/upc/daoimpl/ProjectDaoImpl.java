package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.IprojectDao;
import pe.edu.upc.entity.Project;

public class ProjectDaoImpl implements IprojectDao, Serializable {
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "Otherbusiness")
	private EntityManager em;
	

	@Override
	public void insert(Project project) {
		// manipular la data insert, modificacion a la BD
		try {
		  em.persist(project);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Project");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> list() {
		List<Project> lista = new ArrayList<Project>();
		try {

			Query q = em.createQuery("select i from Project i");
			lista = (List<Project>) q.getResultList();

		} catch(
				
	Exception e) {
			System.out.println("Error al listar los datos de project");
		}
		return lista;
	}

}