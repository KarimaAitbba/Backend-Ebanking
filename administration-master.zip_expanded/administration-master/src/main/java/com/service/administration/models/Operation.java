package com.service.administration.models;
import java.io.Serializable;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import ch.qos.logback.classic.pattern.DateConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long Idperation;
		private Date dateoperation=new  Date();
		
		
		
		public Long getIdperation() {
			return Idperation;
		}

		public void setIdperation(Long idperation) {
			Idperation = idperation;
		}

		public Date getDateoperation() {
			return dateoperation;
		}

		public void setDateoperation(Date dateoperation) {
			this.dateoperation = dateoperation;
		}

	

		

		public Operation(Long idperation, Date dateoperation) {
			super();
			this.Idperation = idperation;
			this.dateoperation = dateoperation;
		}

		public Operation() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
