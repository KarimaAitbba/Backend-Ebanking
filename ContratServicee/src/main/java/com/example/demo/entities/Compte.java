package com.example.demo.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Compte implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long  idCompte;
	private Date dateCreation;
	private double solde;
	
	//@JsonBackReference
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="id_contrat", nullable=false)
	private Contrat contrat;
	
	@JsonBackReference
	@OneToOne
	@JoinColumn(name="id_cartebancaire") 
	private CarteBancaire carteBancaire;
	
	@JsonIgnore
	//@JsonBackReference
	@OneToMany(mappedBy="compte",fetch=FetchType.EAGER)
	private List<Virement> virements;

	
	public Compte(Long idCompte, Date dateCreation, double solde, CarteBancaire carteBancaire,
			List<Virement> virements,Contrat contrat) {
		super();
		this.idCompte = idCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.contrat = contrat;
		this.carteBancaire = carteBancaire;
		this.virements = virements;
	}


	public Long getIdCompte() {
		return idCompte;
	}


	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public Contrat getContrat_compte() {
		return contrat;
	}


	public void setContrat_compte(Contrat contrat) {
		this.contrat = contrat;
	}


	public CarteBancaire getCarteBancaire() {
		return carteBancaire;
	}


	public void setCarteBancaire(CarteBancaire carteBancaire) {
		this.carteBancaire = carteBancaire;
	}


	public List<Virement> getVirements() {
		return virements;
	}


	public void setOperations(List<Virement> virements) {
		this.virements = virements;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
