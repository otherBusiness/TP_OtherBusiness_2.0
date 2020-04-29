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
@Table(name = "CreditCards")
public class CreditCard implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCreditCard;

	@Column(name = "nameOwnerCreditCard", nullable = false, length = 50)
	private String nameOwnerCreditCard;

	private int numberCreditCard;
	private int cvvCreditCard;
	private Date expirationDateCreditCard;

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(int idCreditCard, String nameOwnerCreditCard, int numberCreditCard, int cvvCreditCard,
			Date expirationDateCreditCard) {
		super();
		this.idCreditCard = idCreditCard;
		this.nameOwnerCreditCard = nameOwnerCreditCard;
		this.numberCreditCard = numberCreditCard;
		this.cvvCreditCard = cvvCreditCard;
		this.expirationDateCreditCard = expirationDateCreditCard;
	}

	public int getIdCreditCard() {
		return idCreditCard;
	}

	public void setIdCreditCard(int idCreditCard) {
		this.idCreditCard = idCreditCard;
	}

	public String getNameOwnerCreditCard() {
		return nameOwnerCreditCard;
	}

	public void setNameOwnerCreditCard(String nameOwnerCreditCard) {
		this.nameOwnerCreditCard = nameOwnerCreditCard;
	}

	public int getNumberCreditCard() {
		return numberCreditCard;
	}

	public void setNumberCreditCard(int numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public int getCvvCreditCard() {
		return cvvCreditCard;
	}

	public void setCvvCreditCard(int cvvCreditCard) {
		this.cvvCreditCard = cvvCreditCard;
	}

	public Date getExpirationDateCreditCard() {
		return expirationDateCreditCard;
	}

	public void setExpirationDateCreditCard(Date expirationDateCreditCard) {
		this.expirationDateCreditCard = expirationDateCreditCard;
	}
}
