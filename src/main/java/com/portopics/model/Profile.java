package com.portopics.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class Profile implements Serializable {

	/**
	 * Serial version UID 
	 */
	private static final long serialVersionUID = 854914157217322111L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String email;
	
	@Lob
	private Byte[] photo;
	
	public Long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Byte[] getPhoto() {
		return photo;
	}
	
	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

}
