package com.denisetelli.api.rest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Contact {

	@JsonIgnore
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Id
	private Long id;
	private String nome;
	private String email;
	private String fone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Contact(Long id, String nome, String email, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	
}
