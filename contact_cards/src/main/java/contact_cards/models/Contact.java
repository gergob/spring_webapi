package contact_cards.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="contacts")
public class Contact {
	
	@Id
	private String id;
	
	@Field(value="first_name")
	private String firstName;
	
	@Field(value="last_name")
	private String lastName;
	
	@Field(value="website")
	private String website;
	
	@Field(value="email")
	private String email;
	
	@Field(value="work_phone")
	private String workPhone;
	
	@Field(value="home_phone")
	private String homePhone;
	
	@Field(value="mobile_phone")
	private String mobilePhone;
	
	@Field(value="birthday_phone")
	private Date birthday;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
