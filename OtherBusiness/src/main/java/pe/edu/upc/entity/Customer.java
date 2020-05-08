package pe.edu.upc.entity;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", length = 80, nullable = false)
	private String name;
	
	@Column(name = "lastname", length = 80, nullable = false)
	private String lastname;

	@Column(name = "address", length = 120, nullable = false)
	private String address;

	@Column(name = "dni", length = 8, nullable = false)
	private String dni;

	@Column(name = "phone", length = 9, nullable = false)
	private String phone;
	
	
	@Column(name = "country", nullable = false)
	private String country;

	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
	private Users user;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int id, String name, String lastname, String address, String dni, String phone,
			String country, Users user) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.dni = dni;
		this.phone = phone;
		this.country = country;
		this.user = user;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}

	
	

}