package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	//no
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int idUser;
	//--------------------------falta de customer
	@Id//si
	private int id;

	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "idCustomer", nullable = false)
	private Customer customer;
	

	@Column(name = "usernameUser", nullable = false, length = 30)
	private String usernameUser;

	@Column(name = "passwordUser", nullable = false, length = 80)
	private String passwordUser;
	//
	
	@Column(name = "rol", nullable = false, length = 1)
	private String rol;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, Customer customer, String usernameUser, String passwordUser, String rol) {
		super();
		this.id = id;
		this.customer = customer;
		this.usernameUser = usernameUser;
		this.passwordUser = passwordUser;
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	
	
	
	
}
