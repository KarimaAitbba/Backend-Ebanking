package com.service.administration.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Offre implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_Offre;
	private Date dateDebut;
	private Date dateFin;
	private Boolean Choisi;
	private Boolean etatOffre;
	
	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
	 * CascadeType.MERGE})
	 * 
	 * @JoinTable( name = "gestionOffre", joinColumns = @JoinColumn(name =
	 * "id_Offre"), inverseJoinColumns = @JoinColumn(name = "id")) private
	 * Set<Abonne> tags = new HashSet<>();
	 * 
	 * @JsonIgnore
	 * 
	 * @ManyToOne(fetch=FetchType.LAZY)
	 * 
	 * @JoinColumn(name="id", nullable=false)//colonne de agnece private Bo bo;
	 */
	
	
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Offre(Long id_Offre, Date dateDebut, Date dateFin, Boolean choisi, Boolean etatOffre) {
		super();
		this.id_Offre = id_Offre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		Choisi = choisi;
		this.etatOffre = etatOffre;
	}



	public Long getId_Offre() {
		return id_Offre;
	}



	public void setId_Offre(Long id_Offre) {
		this.id_Offre = id_Offre;
	}



	public Date getDateDebut() {
		return dateDebut;
	}



	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	public Date getDateFin() {
		return dateFin;
	}



	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}



	public Boolean getChoisi() {
		return Choisi;
	}



	public void setChoisi(Boolean choisi) {
		Choisi = choisi;
	}



	public Boolean getEtatOffre() {
		return etatOffre;
	}



	public void setEtatOffre(Boolean etatOffre) {
		this.etatOffre = etatOffre;
	}
	
	

}
