package com.cibertec.service;

import org.springframework.stereotype.Service;

import com.cibertec.dto.Operacion;

@Service
public class CalculadoraService {

	public Integer suma(Operacion operacion) {
		return operacion.getOperando1() + operacion.getOperando2();
	}
	
	public Integer resta(Operacion operacion) {
		return operacion.getOperando1() - operacion.getOperando2();
	}
	
}
