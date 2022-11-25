package com.example.demo;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.springboot.CitaMedicaSB;

@SpringBootApplication
public class ProyectoU1YfApplication<PacienteAdultoSB, CitaMedicaSB, VeterinarioSB> implements CommandLineRunner{
	
	@Autowired
	private CitaMedicaSB citamedicaSB;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1YfApplication.class, args);
	}
	
	
	public void run1(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SPRING BOOT");
		
	   
		
	}

}
