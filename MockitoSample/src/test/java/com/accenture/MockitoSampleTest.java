package com.accenture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class MockitoSampleTest {
	
	Calculator c=null;
	
	//Mockito gives us the object..
	CalculatorService service= new Mockito().mock(CalculatorService.class);
	
	
	
	//fake service
	//anonymous inner class
	/*CalculatorService service=new CalculatorService() {
		
		public int add(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}
	};*/
	
	@BeforeEach
	void init() {
		c=new Calculator(service);
		
	}
	
	//here we are tested only Calculator class not CalculatorService...
	
	@Test
	void testPerform() {
		when(service.add(2,3)).thenReturn(5);
		assertEquals(10, c.perform(2,3));
		
		verify(service).add(2, 3);  // it checks that we are actually calling (mock) service or not..
	}

}
