package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Projects")
public class Project implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProject;
	
	@Column(name = "nameProject", nullable = false, length = 50)
	private String nameProject;
	
	@Column(name = "nameGroupProject", nullable = false, length = 50)
	private String nameGroupProject;
	
	@Column(name = "descriptionProject", nullable = false, length = 500)
	private String descriptionProject;
	
	private float costProject;
	private Date startDateProject;
	private Date finishDateProject;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int idProject, String nameProject, String nameGroupProject, String descriptionProject,
			float costProject, Date startDateProject, Date finishDateProject) {
		super();
		this.idProject = idProject;
		this.nameProject = nameProject;
		this.nameGroupProject = nameGroupProject;
		this.descriptionProject = descriptionProject;
		this.costProject = costProject;
		this.startDateProject = startDateProject;
		this.finishDateProject = finishDateProject;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public String getNameGroupProject() {
		return nameGroupProject;
	}

	public void setNameGroupProject(String nameGroupProject) {
		this.nameGroupProject = nameGroupProject;
	}

	public String getDescriptionProject() {
		return descriptionProject;
	}

	public void setDescriptionProject(String descriptionProject) {
		this.descriptionProject = descriptionProject;
	}

	public float getCostProject() {
		return costProject;
	}

	public void setCostProject(float costProject) {
		this.costProject = costProject;
	}

	public Date getStartDateProject() {
		return startDateProject;
	}

	public void setStartDateProject(Date startDateProject) {
		this.startDateProject = startDateProject;
	}

	public Date getFinishDateProject() {
		return finishDateProject;
	}

	public void setFinishDateProject(Date finishDateProject) {
		this.finishDateProject = finishDateProject;
	}
}
