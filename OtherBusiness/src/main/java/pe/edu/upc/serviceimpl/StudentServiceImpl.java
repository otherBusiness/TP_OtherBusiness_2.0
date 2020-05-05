package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IstudentDao;
import pe.edu.upc.entity.Student;
import pe.edu.upc.serviceinterface.IstudentService;

@Named
@RequestScoped
public class StudentServiceImpl implements IstudentService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject /* Inyeccion de dependencias */
	private IstudentDao iD;

	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		try {
			iD.insert(student);
		} catch (Exception e) {
			System.out.println("Error en el ServiceStudent al insertar un Student");
		}
	}

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}

}
