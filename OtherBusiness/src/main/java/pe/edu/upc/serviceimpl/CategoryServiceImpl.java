package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IcategoryDao;
import pe.edu.upc.entity.Category;
import pe.edu.upc.serviceinterface.IcategoryService;

public class CategoryServiceImpl implements Serializable, IcategoryService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IcategoryDao caDao;
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return caDao.list();
	}

}
