package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.beans.BeanCopier.Generator;

@SpringBootApplication
public class RestServiceApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);

		

		System.out.println("_________________________________________");
		System.out.println("         BANCO RECIFE CONECTADO	         ");
		System.out.println("Seja bem vindo ao Banco Recife Conectado.");
		System.out.println("_________________________________________");

		List<User> users = new ArrayList<>();
        users.add(new Pessoa());
        users.add(new Pessoa());

        final var queue = new Queue();

        for (User user : users) {
            queue.addUser(user);
        }

        // automated tests
        queue.addUser(new User("Test", "333333333", "test@email.com"));
        assert queue.getUsers().size() == 3;
        assert queue.getUsers().get(2).getName().equals("Test");

        User removed User;
		
	}
}