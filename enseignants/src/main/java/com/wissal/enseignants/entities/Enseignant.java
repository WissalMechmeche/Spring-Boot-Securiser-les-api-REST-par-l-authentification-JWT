package com.wissal.enseignants.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enseignant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnseignant;
	private String nomEnseignant;
	private Double salaire;
	private Date dateNaissance;
	@ManyToOne
	private Departement departement;
	
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(String nomEnseignant, Double salaire, Date dateNaissance) {
		super();
		this.nomEnseignant = nomEnseignant;
		this.salaire = salaire;
		this.dateNaissance = dateNaissance;
	}
	public Long getIdEnseignant() {
		return idEnseignant;
	}
	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
	public String getNomEnseignant() {
		return nomEnseignant;
	}
	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nomEnseignant=" + nomEnseignant + ", salaire=" + salaire
				+ ", dateNaissance=" + dateNaissance + "]";
	}
}
