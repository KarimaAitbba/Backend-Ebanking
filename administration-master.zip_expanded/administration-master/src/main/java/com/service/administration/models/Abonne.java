package com.service.administration.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="abonne")
@PrimaryKeyJoinColumn(name = "id")
public class Abonne extends User implements Serializable{

		private static final long serialVersionUID = 1L;
		private String cin;
		private String nom;
		private String prenom;
		private String adress;
		private int numTel;
		private String profession;
	   	private  Boolean isActivated;
	   	
	    @JsonManagedReference
	   	@OneToOne
	   	@JoinColumn(name="Codecontrat")
		private Contrat contrat;
		
	   
		public Abonne(Long id, String email, String username, String password, String cin, String nom, String prenom,
				String adress, int numTel, String profession, Boolean isActivated, Contrat contrat) {
			super(id, email, username, password);
			this.cin = cin;
			this.nom = nom;
			this.prenom = prenom;
			this.adress = adress;
			this.numTel = numTel;
			this.profession = profession;
			this.isActivated = isActivated;
			this.contrat = contrat;
		}


		public String getCin() {
			return cin;
		}


		public void setCin(String cin) {
			this.cin = cin;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getAdress() {
			return adress;
		}


		public void setAdress(String adress) {
			this.adress = adress;
		}


		public int getNumTel() {
			return numTel;
		}


		public void setNumTel(int numTel) {
			this.numTel = numTel;
		}


		public String getProfession() {
			return profession;
		}


		public void setProfession(String profession) {
			this.profession = profession;
		}


		public Boolean getIsActivated() {
			return isActivated;
		}


		public void setIsActivated(Boolean isActivated) {
			this.isActivated = isActivated;
		}


		public Contrat getContrat() {
			return contrat;
		}


		public void setContrat(Contrat contrat) {
			this.contrat = contrat;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		public Abonne() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
	}
