package com.Semafoor.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Annotating the main class of your application with the @SpringBootApplication annotation creates a class that
bootstraps your application. When the application runs, it starts from here.
It also marks this class as an @Configuration class, so Spring knows to scan for other annotated components. This way
we don't have to write xml configuration files.
 */

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

}
