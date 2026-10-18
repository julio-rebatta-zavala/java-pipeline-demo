package com.cibertec.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cibertec.dto.Operacion;

class CalculadoraServiceTest {

	private final CalculadoraService service = new CalculadoraService();
	
	@Test
	void sumaDeDosOperandos() {
		Operacion operacion = new Operacion();
		operacion.setOperando1(5);
		operacion.setOperando2(7);
		
		Integer resultado = service.suma(operacion);
		
		assertEquals(12, resultado);
	}
	
	@Test
	void restaDeDosOperandos() {
		Operacion operacion = new Operacion();
		operacion.setOperando1(25);
		operacion.setOperando2(5);
		
		Integer resultado = service.resta(operacion);
		
		assertEquals(20, resultado);
	}

}
