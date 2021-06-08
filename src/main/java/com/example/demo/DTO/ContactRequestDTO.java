package com.example.demo.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ContactRequestDTO {

    @Size(max = 20, min = 5)
    @NotBlank
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 20, min = 5)
    private String message;

	public ContactRequestDTO(@Size(max = 20, min = 5) @NotBlank String username,
			@NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(max = 20, min = 5) String message) {
		super();
		this.username = username;
		this.email = email;
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getMessage() {
		return message;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
