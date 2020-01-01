package com.service.administration.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
@PrimaryKeyJoinColumn(name = "Idperation")
public class Virement extends Operation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double montant;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="id_compte_abonne")//colonne de compte
	private Compte compte;

	
	private String id_compte_beneficiare;

	private String type_virement;


	









	public Virement(Long idperation, Date dateoperation, double montant, Compte compte, String id_compte_beneficiare,
			String type_virement) {
		super(idperation, dateoperation);
		this.montant = montant;
		this.compte = compte;
		this.id_compte_beneficiare = id_compte_beneficiare;
		this.type_virement = type_virement;
	}






	public double getMontant() {
		return montant;
	}






	public void setMontant(double montant) {
		this.montant = montant;
	}






	public Compte getCompte_abonne() {
		return compte;
	}






	public void setCompte_abonne(Compte compte_abonne) {
		this.compte = compte_abonne;
	}






	public String getId_compte_beneficiare() {
		return id_compte_beneficiare;
	}






	public void setId_compte_beneficiare(String id_compte_beneficiare) {
		this.id_compte_beneficiare = id_compte_beneficiare;
	}






	public String getType_virement() {
		return type_virement;
	}






	public void setType_virement(String type_virement) {
		this.type_virement = type_virement;
	}






	public static long getSerialversionuid() {
		return serialVersionUID;
	}






	public Virement() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
