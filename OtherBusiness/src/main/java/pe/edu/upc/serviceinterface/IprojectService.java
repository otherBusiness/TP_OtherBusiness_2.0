package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Project;

public interface IprojectService {
	public void insert(Project infectious);

	public List<Project> list();
}
