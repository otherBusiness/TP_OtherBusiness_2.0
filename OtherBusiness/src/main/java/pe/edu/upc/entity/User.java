package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@Column(name = "usernameUser", nullable = false, length = 50)
	private String usernameUser;
	
	@Column(name = "passwordUser", nullable = false, length = 50)
	private String passwordUser;
	
	@Column(name = "firstNameUser", nullable = false, length = 50)
	private String firstNameUser;
	
	@Column(name = "lastNameUser", nullable = false, length = 50)
	private String lastNameUser;
	
	private int dniUser;
	private int phoneUser;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int idUser, String usernameUser, String passwordUser, String firstNameUser, String lastNameUser,
			int dniUser, int phoneUser) {
		super();
		this.idUser = idUser;
		this.usernameUser = usernameUser;
		this.passwordUser = passwordUser;
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.dniUser = dniUser;
		this.phoneUser = phoneUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsernameUser() {
		return usernameUser;
	}

	public void setUsernameUser(String usernameUser) {
		this.usernameUser = usernameUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getFirstNameUser() {
		return firstNameUser;
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	public int getDniUser() {
		return dniUser;
	}

	public void setDniUser(int dniUser) {
		this.dniUser = dniUser;
	}

	public int getPhoneUser() {
		return phoneUser;
	}

	public void setPhoneUser(int phoneUser) {
		this.phoneUser = phoneUser;
	}
}
