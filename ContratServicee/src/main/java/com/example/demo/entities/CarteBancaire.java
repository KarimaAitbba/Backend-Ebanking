package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
public class CarteBancaire implements Serializable{
	
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
	    private Long  idCarte;
		private String pin;
		private Date dateExperation;
		private double montant;
		private String  Etat;
		
		@JsonBackReference
		@OneToOne(mappedBy="carteBancaire", fetch=FetchType.LAZY)// référence la relation dans la classe Compte
		private Compte Compte;

		
		public CarteBancaire(Long idCarte, String pin, Date dateExperation, double montant, String etat,
				Compte compte) {
			super();
			this.idCarte = idCarte;
			this.pin = pin;
			this.dateExperation = dateExperation;
			this.montant = montant;
			Etat = etat;
			Compte = compte;
		}


		public Long getIdCarte() {
			return idCarte;
		}


		public void setIdCarte(Long idCarte) {
			this.idCarte = idCarte;
		}


		public String getPin() {
			return pin;
		}


		public void setPin(String pin) {
			this.pin = pin;
		}


		public Date getDateExperation() {
			return dateExperation;
		}


		public void setDateExperation(Date dateExperation) {
			this.dateExperation = dateExperation;
		}


		public double getMontant() {
			return montant;
		}


		public void setMontant(double montant) {
			this.montant = montant;
		}


		public String getEtat() {
			return Etat;
		}


		public void setEtat(String etat) {
			Etat = etat;
		}


		public Compte getCompte() {
			return Compte;
		}


		public void setCompte(Compte compte) {
			Compte = compte;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		public CarteBancaire() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
