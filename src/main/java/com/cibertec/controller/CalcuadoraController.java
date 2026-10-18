package com.cibertec.controller;

import com.cibertec.service.CalculadoraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.dto.Operacion;

@RestController
@RequestMapping("/api/v1/calculadora")
public class CalcuadoraController {

	private final CalculadoraService calculadoraService;

	CalcuadoraController(CalculadoraService calculadoraService) {
		this.calculadoraService = calculadoraService;
	}

	@PostMapping("/suma")
	public Integer suma(@RequestBody Operacion operacion) {
		return calculadoraService.suma(operacion);
	}
	
	@PostMapping("/resta")
	public Integer resta(@RequestBody Operacion operacion) {
		return calculadoraService.resta(operacion);
	}
	
}
