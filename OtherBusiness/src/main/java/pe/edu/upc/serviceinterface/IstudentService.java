package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Student;

public interface IstudentService {
	public void insert(Student student);

	public List<Student> list();
}
