package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;

import pe.edu.upc.entity.Customer;
import pe.edu.upc.entity.Rol;
import pe.edu.upc.entity.Users;

import pe.edu.upc.serviceinterface.IcustomerService;
import pe.edu.upc.serviceinterface.IrolServiceImpl;

@Named
@ViewScoped
public class RegisterController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject 
	//private cS;
	private IcustomerService cS;

	@Inject 
	
    private IrolServiceImpl rS;
	
	private Customer customer;
	private Users user;

	@PostConstruct
	public void init() {
		this.customer = new Customer();
		this.user = new Users();
	}

	public String registerUser() {
		String redirect = null;
		try {
			String password = this.user.getPasswordUser();
			String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
			this.user.setPasswordUser(passwordHash);
			this.user.setRol("A");//.setR("A");//.setState("A");//
			this.customer.setUser(user);
			this.user.setCustomer(customer);
			this.cS.insert(customer);

			List<Rol> roles = new ArrayList<Rol>();
			int TIPO_USUARIO = 1;
			Rol r = new Rol();
			r.setIdRol(TIPO_USUARIO);
			roles.add(r);
			rS.assignRolesToUser(user, roles);
			redirect = "index?faces-redirect=true";
		} catch (Exception e) {

		}

		return redirect;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

}