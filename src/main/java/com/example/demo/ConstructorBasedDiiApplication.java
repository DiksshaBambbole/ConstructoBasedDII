package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConstructorBasedDiiApplication {
String s="Diksha";

//Shweta changes
int i=1;

String s="Sagar";
//REENA Changes
double d=2.1;


	public static void main(String[] args) {
		SpringApplication.run(ConstructorBasedDiiApplication.class, args);
	}

}
