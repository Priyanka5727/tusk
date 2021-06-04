package com.accenture;

public class Calculator 
{
	CalculatorService service;
	
	Calculator(CalculatorService service)
	{
		this.service=service;
	}
	
	public int perform(int i, int j) {
		return service.add(i, j)*i;
	}
}
