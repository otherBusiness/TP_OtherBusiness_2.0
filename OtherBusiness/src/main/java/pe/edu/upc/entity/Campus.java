package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Campus")
public class Campus implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCampus;

	@Column(name = "nameCampus", nullable = false, length = 50)
	private String nameCampus;

	// constructor vacio
	public Campus() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor inicializado
	public Campus(int idCampus, String nameCampus) {
		super();
		this.idCampus = idCampus;
		this.nameCampus = nameCampus;
	}

	// get y set
	public int getIdCampus() {
		return idCampus;
	}

	public void setIdCampus(int idCampus) {
		this.idCampus = idCampus;
	}

	public String getNameCampus() {
		return nameCampus;
	}

	public void setNameCampus(String nameCampus) {
		this.nameCampus = nameCampus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCampus;
		result = prime * result + ((nameCampus == null) ? 0 : nameCampus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campus other = (Campus) obj;
		if (idCampus != other.idCampus)
			return false;
		if (nameCampus == null) {
			if (other.nameCampus != null)
				return false;
		} else if (!nameCampus.equals(other.nameCampus))
			return false;
		return true;
	}
	
	
}
