package com.service.administration.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Contrat implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Codecontrat ;
	private Date Dateexperation;
	private String objectif;
	
	@JsonBackReference
	@OneToOne(mappedBy="contrat")
	@JoinColumn(name="id_abonne")  
    private Abonne abonnee;
	
	@JsonIgnore
	@OneToMany(mappedBy="contrat",fetch=FetchType.LAZY)
	private List<Compte> comptes;

	@ManyToOne
	@JoinColumn(name="id_bo")
	private Bo bo;


	


	public Contrat(Long codecontrat, Date dateexperation, String objectif, List<Compte> comptes, Abonne abonnee, Bo bo) {
		super();
		Codecontrat = codecontrat;
		Dateexperation = dateexperation;
		this.objectif = objectif;
		this.abonnee = abonnee;
		this.comptes = comptes;
		this.bo = bo;
	}





	public Long getCodecontrat() {
		return Codecontrat;
	}





	public void setCodecontrat(Long codecontrat) {
		Codecontrat = codecontrat;
	}





	public Date getDateexperation() {
		return Dateexperation;
	}





	public void setDateexperation(Date dateexperation) {
		Dateexperation = dateexperation;
	}





	public String getObjectif() {
		return objectif;
	}





	public void setObjectif(String objectif) {
		this.objectif = objectif;
	}





public Abonne getAbonnee() {
		return abonnee;
	}





	public void setAbonnee(Abonne abonnee) {
		this.abonnee = abonnee;
	}



	public List<Compte> getComptes() {
		return comptes;
	}





	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}




	public Bo getBo() {
		return bo;
	}





	public void setBo(Bo bo) {
		this.bo = bo;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
