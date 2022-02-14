package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		
	ApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);
	
	UserRepository userrepository = context.getBean(UserRepository.class);
	
	User user = new User();
	
	user.setId(0);
	user.setName("Minato Namikaze");
	user.setCity("Hidden Leaf");
	user.setStatus("Yellow Flash");
	
	
	User user1 = userrepository.save(user);
	
	
	}

}
