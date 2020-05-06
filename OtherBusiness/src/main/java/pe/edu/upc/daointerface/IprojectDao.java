package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Project;

public interface IprojectDao {
	
	public void insert(Project project);
	
	public List<Project> list();
	
}