package calculatortest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.Calculator;


public class CalculatorTestCase {
	Calculator calculator =new Calculator();
	
	@Test
	public void testAdd() {
		System.out.println("Begin add Test");
		float expected = 5;
		assertEquals(calculator.add(3, 2), expected, 0);
		
	}
	

}
