package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	@Column
	private String username ;
	@Size(max = 20, min = 5)
	@NotBlank
	@Column
	private String email ;
	@Size(max = 20, min = 5)
	@NotBlank
	@Column
	private String message ;
	@Size(max = 20, min = 5)
	@NotBlank
	public Contact(){
		
	}
	
	
	public Contact(@Size(max = 20, min = 5) @NotBlank String username,@Size(max = 20, min = 5) @NotBlank String email,@Size(max = 20, min = 5) @NotBlank String message) {
		super();
		this.username = username;
		this.email = email;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
