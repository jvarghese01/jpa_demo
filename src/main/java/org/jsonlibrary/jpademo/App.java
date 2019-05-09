package org.jsonlibrary.jpademo;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import org.jsonlibrary.jpademo.entities.Item;
import org.jsonlibrary.repositories.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {
	
	@Autowired
	private ItemRepository irep;
	
	private static Logger LOG = LoggerFactory.getLogger(App.class);
	

	public void run(String... args) throws Exception {
		
		save();

		
	}
	
    @PostConstruct
	public void save() {
		Item item = new Item();
		item.setProductName("Pancake mix");
		item.setDescription("Buttermilk pancakes");
		item.setItemCode("12345");
		item.setPrice(BigDecimal.valueOf(4.99));
		irep.save(item);
	}

}
