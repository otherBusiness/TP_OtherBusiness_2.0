package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Investors")
public class Investor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInvestor;

	@Column(name = "countrInvestor", nullable = false, length = 50)
	private String countrInvestor;
	
	@Column(name = "districtInvestor", nullable = false, length = 50)
	private String districtInvestor;
	
	@Column(name = "emailInvestor", nullable = false, length = 50)
	private String emailInvestor;

	private int rucInvestor;

	public Investor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Investor(int idInvestor, String countrInvestor, String districtInvestor, String emailInvestor,
			int rucInvestor) {
		super();
		this.idInvestor = idInvestor;
		this.countrInvestor = countrInvestor;
		this.districtInvestor = districtInvestor;
		this.emailInvestor = emailInvestor;
		this.rucInvestor = rucInvestor;
	}

	public int getIdInvestor() {
		return idInvestor;
	}

	public void setIdInvestor(int idInvestor) {
		this.idInvestor = idInvestor;
	}

	public String getCountrInvestor() {
		return countrInvestor;
	}

	public void setCountrInvestor(String countrInvestor) {
		this.countrInvestor = countrInvestor;
	}

	public String getDistrictInvestor() {
		return districtInvestor;
	}

	public void setDistrictInvestor(String districtInvestor) {
		this.districtInvestor = districtInvestor;
	}

	public String getEmailInvestor() {
		return emailInvestor;
	}

	public void setEmailInvestor(String emailInvestor) {
		this.emailInvestor = emailInvestor;
	}

	public int getRucInvestor() {
		return rucInvestor;
	}

	public void setRucInvestor(int rucInvestor) {
		this.rucInvestor = rucInvestor;
	}
}
