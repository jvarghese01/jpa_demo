package org.jsonlibrary.jpademo;

import java.math.BigDecimal;
import java.util.Locale.Category;

import javax.annotation.PostConstruct;

import org.jsonlibrary.jpademo.entities.Item;
import org.jsonlibrary.jpademo.repositories.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	@Autowired
	public ItemRepository irep;
	
	private static Logger LOG = LoggerFactory.getLogger(App.class);
	
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.run(args);   
    }
	

	
	public void save() {
		for(int a=0;a<100;a++) {
			Item item = new Item();
			item.setProductName("Pancake mix -- "+ (a+1));
			item.setDescription("Buttermilk pancakes");
			item.setItemCode("12345" + a+1);
			item.setPrice(BigDecimal.valueOf(4.99));
			item.setCategory(Item.Category.Packaged);
			irep.save(item);
		}
	}


	
	public void run(String... args) throws Exception {
		save();
		
	}

}
