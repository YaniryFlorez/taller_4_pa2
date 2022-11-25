package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component //Le estamos diciendo a Spring esto lo vas a controlar tu, tu vas  a hacer el new
public class PacienteAdultoSB extends PacienteSB {
	
	private String vacunas;
	
    public Integer calcularDescuento() {
		
		System.out.println("Paciente vacunas con 20 % de descuento");
		return 20;
	}

	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}

	

}
