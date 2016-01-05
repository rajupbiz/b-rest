package com.blob.restctrl;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blob.model.Contact;

@RestController
public class TestCtrl {

	@RequestMapping(value="/contact/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Contact> getContact(@PathVariable Long id){
		
		System.out.println("  id ===>   "+id);
		
		Contact c = new Contact();
		c.setId(id);
		c.setFirstName("Max");
		
		return new ResponseEntity<Contact>(c, HttpStatus.OK);
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Contact> getAllContacts(){
		
		System.out.println("  getAllContacts ===>   ");
		
		Contact c = new Contact();
		c.setId(1L);
		c.setFirstName("Max");
		
		c = new Contact();
		c.setId(2L);
		c.setFirstName("Mark");
		
		return new ResponseEntity<Contact>(c, HttpStatus.OK);
	}
}
