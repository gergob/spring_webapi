package contact_cards;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoURI;

@Configuration
public class MongoConfiguration {

	private final String URI = "mongodb://localhost:27017";

	public @Bean MongoTemplate mongoTemplate() throws Exception {

		@SuppressWarnings("deprecation")
		SimpleMongoDbFactory factory = new SimpleMongoDbFactory(new Mongo(new MongoURI(URI)),"contact_db");  

		return new MongoTemplate(factory);
	}
}