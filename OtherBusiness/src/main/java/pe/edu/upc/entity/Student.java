package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStudent;

	@Column(name = "emailStudent", nullable = false, length = 50)
	private String emailStudent;

	@ManyToOne
	@JoinColumn(name = "idCampus", nullable = false)
	private Campus campus;
	
	private int codeStudent;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int idStudent, String emailStudent, int codeStudent, Campus campus) {
		super();
		this.idStudent = idStudent;
		this.emailStudent = emailStudent;
		this.campus=campus;
		this.codeStudent = codeStudent;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getEmailStudent() {
		return emailStudent;
	}

	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}

	public int getCodeStudent() {
		return codeStudent;
	}

	public void setCodeStudent(int codeStudent) {
		this.codeStudent = codeStudent;
	}
}
