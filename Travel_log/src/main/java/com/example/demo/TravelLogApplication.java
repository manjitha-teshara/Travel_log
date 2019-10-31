package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TravelLogApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(TravelLogApplication.class, args);
		System.out.println("Travel Log Start ...");
		
		
	}
	@Override
	   public void run(ApplicationArguments arg0) throws Exception {
	      System.out.println("Hello World from Application Runner");
	   }

}
