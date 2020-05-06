package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IprojectDao;
import pe.edu.upc.entity.Project;
import pe.edu.upc.serviceinterface.IprojectService;



@Named
@RequestScoped
public class ProjectServiceImpl implements IprojectService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject /* inyeccion de dependencias */
	private IprojectDao iD;

	@Override
	public void insert(Project project) {
		try {
			iD.insert(project);

		} catch (Exception e) {
			System.out.println("Error en el service al insertar un project");
		}
	}

	@Override
	public List<Project> list() {

		return iD.list();
	}

}
