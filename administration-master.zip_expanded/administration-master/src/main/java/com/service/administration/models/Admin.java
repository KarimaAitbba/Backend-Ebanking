package com.service.administration.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="admin")
@PrimaryKeyJoinColumn(name = "id")
public class Admin extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String cin;
	private String nom;
	private String prenom;
	private String adress;
	private int numTel;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Long id, String email, String username, String password) {
		super(id, email, username, password);
		// TODO Auto-generated constructor stub
	}

	public Admin(Long id, String email, String username, String password, String cin, String nom, String prenom,
			String adress, int numTel) {
		super(id, email, username, password);
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.numTel = numTel;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
