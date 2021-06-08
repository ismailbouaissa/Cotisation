package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.ContactRequestDTO;
import com.example.demo.repositories.ContactRepository;

@RequestMapping("/api/v1/cont")
@RestController
@CrossOrigin
public class ContactControlles {
	@Autowired
	private ContactRepository contactRepository ;
	@PostMapping("/Contact")
	public ResponseEntity<Void> Contact(@RequestBody @Validated ContactRequestDTO contactUserDto){
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	public ContactRepository getContactRepository() {
		return contactRepository;
	}
	public void setContactRepository(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}

}
