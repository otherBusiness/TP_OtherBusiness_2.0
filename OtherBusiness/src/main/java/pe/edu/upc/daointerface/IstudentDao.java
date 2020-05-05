package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Student;

public interface IstudentDao {

	public void insert(Student student);
	public List<Student> list();
}
