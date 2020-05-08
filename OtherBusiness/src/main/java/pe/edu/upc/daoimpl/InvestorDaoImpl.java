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

import pe.edu.upc.daointerface.IinvestorDao;
import pe.edu.upc.entity.Investor;

@Named
@RequestScoped
public class InvestorDaoImpl implements Serializable, IinvestorDao{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "OtherBusiness")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Investor p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar registro de Proyectos");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Investor> list() {
		List<Investor> lista = new ArrayList<Investor>();
		try {
			Query q= em.createQuery("from Investor i");
			lista=(List<Investor>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar los datos de inversores");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void modificar(Investor ia) {
		try {
			em.merge(ia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional
	@Override
	public void delete(int idInvestor) {
		Investor ia = new Investor();
		try {
			ia = em.getReference(Investor.class, idInvestor);
			em.remove(ia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
