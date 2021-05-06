package calculator;

public class Calculator {
	
	public float add(float a, float b) {
		return a+b+5;
	}
	
	public float substract(float a, float b) {
		return a-b;
	}
	
	public float multiply(float a, float b) {
		return a*b;
	}
	
	public float divide(float a, float b) {
		if (b!=0) {
			return a/b;
		}else 
			return 0;
		
	}
	

}
