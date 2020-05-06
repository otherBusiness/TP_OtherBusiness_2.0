package pe.edu.upc.serviceimpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IcampusDao;
import pe.edu.upc.entity.Campus;
import pe.edu.upc.serviceinterface.IcampusService;

@Named
@RequestScoped
public class CampusServiceImpl implements Serializable, IcampusService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IcampusDao cDao;

	@Override
	public List<Campus> list() {
		// TODO Auto-generated method stub
		return cDao.list();
	}

}
