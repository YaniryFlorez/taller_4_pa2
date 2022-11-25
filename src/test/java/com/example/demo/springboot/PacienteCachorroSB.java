package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class PacienteCachorroSB extends PacienteSB {

	private int pesoNacimiento;
	private int tamanioNacimiento;

	public Integer calcularDescuento() {

		System.out.println("Paciente niño con 05% de descuento");
		return 5;
	}

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

	public int getTamanioNacimiento() {
		return tamanioNacimiento;
	}

	public void setTamanioNacimiento(int tamanioNacimiento) {
		this.tamanioNacimiento = tamanioNacimiento;
	}

	

}
