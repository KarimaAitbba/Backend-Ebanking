package org.sid.servicetransaction.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Beneficiare implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id ;
	    
	    private String email ;
	    private String nom;
	    private String prenom;
	    private String numCompte;
	    private int numTel;
		private String cin;
		private String adresse;
		
		//@JsonManagedReference
		@OneToOne
		@JoinColumn(name="id_abonne")
		private Abonne abonne;

				public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
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

		public String getNumCompte() {
			return numCompte;
		}

		public void setNumCompte(String numCompte) {
			this.numCompte = numCompte;
		}

		public int getNumTel() {
			return numTel;
		}

		public void setNumTel(int numTel) {
			this.numTel = numTel;
		}

		public String getCin() {
			return cin;
		}

		public void setCin(String cin) {
			this.cin = cin;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public Abonne getAbonne() {
			return abonne;
		}

		public void setAbonne(Abonne abonnee) {
			this.abonne = abonnee;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

				public Beneficiare() {
			super();
			// TODO Auto-generated constructor stub
		}

				public Beneficiare(Long id, String email, String nom, String prenom, String numCompte, int numTel,
						String cin, String adresse, Abonne abonne) {
					super();
					this.id = id;
					this.email = email;
					this.nom = nom;
					this.prenom = prenom;
					this.numCompte = numCompte;
					this.numTel = numTel;
					this.cin = cin;
					this.adresse = adresse;
					this.abonne = abonne;
				}


}

