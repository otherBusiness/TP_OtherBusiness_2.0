package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	private int codeStudent;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int idStudent, String emailStudent, int codeStudent) {
		super();
		this.idStudent = idStudent;
		this.emailStudent = emailStudent;
		this.codeStudent = codeStudent;
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
