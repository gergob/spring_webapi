package contact_cards.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import contact_cards.models.Contact;


public interface ContactRepository extends MongoRepository<Contact, String> {
	
	public List<Contact> findByFirstName(String firstName);
	public List<Contact> findByLastName(String lastName);
	public List<Contact> findByWebsite(String website);
	public List<Contact> findByEmail(String email);
	public List<Contact> findByMobilePhone(String mobilePhone);
	
}

