package contact_cards.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import contact_cards.models.Contact;


public interface ContactRepository extends MongoRepository<Contact, String> {

	public List<Contact> findByWebsite(String website);
	public List<Contact> findByFirstName(String firstName);
	
	
	
}



//
//import java.net.UnknownHostException;
//import java.util.LinkedList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoException;
//
//import contact_cards.models.Contact;
//
//public class ContactRepository {
//
//	private final Logger logger = Logger.getLogger(ContactRepository.class);
//	
//	private MongoClient client = null;
//	private DB database = null;
//	private DBCollection collection = null;
//
//	public ContactRepository() {
//		try {
//			this.client = new MongoClient("localhost", 27017);
//			this.database = client.getDB("contact_db");
//			this.collection = this.database.getCollection("contacts");
//		} catch (UnknownHostException unknownHostEx) {
//			logger.error(unknownHostEx.getMessage(), unknownHostEx);
//		}
//		catch(MongoException mongoEx){
//			logger.error(mongoEx.getMessage(), mongoEx);
//		}
//	}
//
//	public List<Contact> getAllContacts() {
//		List<Contact> result = new LinkedList<Contact>();
//		
//		DbCursor cursor = this.collection.find();
//		
//		return result;
//	}
//
//}
