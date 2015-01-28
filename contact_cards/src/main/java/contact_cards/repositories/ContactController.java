package contact_cards.repositories;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/contacts/first_name")
	public List<Contact> getAllByFirstName(
			@RequestParam(value="value", required=false) String firstName) {
		List<Contact> result = new LinkedList<Contact>();

		if (!StringUtils.isEmpty(firstName)) {
			result = repository.findByFirstName(firstName);
		} else {

			result = repository.findAll();
		}

		return result;
	}

	@RequestMapping("/contacts/website")
	public List<Contact> getContactsByWebsite(
			@RequestParam(value="value", required=false) String website) {
		List<Contact> result = new LinkedList<Contact>();

		if (!StringUtils.isEmpty(website)) {
			result = repository.findByWebsite(website);
		}
		else {
			result = repository.findByWebsite("");
			result.addAll(repository.findByWebsite(null));
		}

		return result;
	}
	
	@RequestMapping("/contacts/email")
	public List<Contact> getContactsByEmail(
			@RequestParam(value="value", required=false) String email) {
		List<Contact> result = new LinkedList<Contact>();

		if (!StringUtils.isEmpty(email)) {
			result = repository.findByEmail(email);
		}
		else {
			result = repository.findByEmail("");
			result.addAll(repository.findByEmail(null));
		}

		return result;
	}
	
	@RequestMapping("/contacts/mobile_phone")
	public List<Contact> getContactsByMobilePhone(
			@RequestParam(value="value", required=false) String mobilePhone) {
		List<Contact> result = new LinkedList<Contact>();

		if (!StringUtils.isEmpty(mobilePhone)) {
			result = repository.findByMobilePhone(mobilePhone);
		}
		else {
			result = repository.findByMobilePhoneNull();
		}

		return result;
	}

}
