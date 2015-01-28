package contact_cards.repositories;


import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import contact_cards.models.Contact;

@RestController
public class ContactController {

		@Autowired
		private ContactRepository repository;
	
	
	 	@RequestMapping("/contacts")
	    public List<Contact> getAllContacts() {
	    	List<Contact> result = new LinkedList<Contact>();
	 		
	    	result = repository.findAll();
	    	
	 		return result;
	    }
	 	
	 	@RequestMapping("/contacts/website")
	    public List<Contact> getContactsByWebsite() {
	    	List<Contact> result = new LinkedList<Contact>();
	 		
	    	result = repository.findByWebsite("http://tomj.com");
	    	
	 		return result;
	    }
	
}
