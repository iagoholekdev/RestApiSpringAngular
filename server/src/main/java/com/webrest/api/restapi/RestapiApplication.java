package com.webrest.api.restapi;

import com.webrest.api.restapi.model.UserModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	public void run(String... args) throws Exception {
	   new UserModel().addName("Teste");
	}


}
