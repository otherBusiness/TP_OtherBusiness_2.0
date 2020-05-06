package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IrolDao;
import pe.edu.upc.entity.Rol;
import pe.edu.upc.serviceinterface.IrolServiceImpl;

@Named
@RequestScoped
public class RolServiceImpl implements IrolServiceImpl, Serializable {
	private static final long serialVersionUID = 1L;
	@Inject /* inyeccion de dependencia */
	private IrolDao ID; // conctar con el dao

	public void insert(Rol rol) {
		try {
			ID.insert(rol);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un infectious agent");
		}
		
	}

	public List<Rol> list() {
		return ID.list();
	}

}
