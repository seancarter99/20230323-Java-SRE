package mavenpractice;

public class Calculator {
	
	private String name;
	private int numberOfKeys;
	
	public Calculator() {}
	
	public Calculator(String name, int numberOfKeys) {
		this.name = name;
		this.numberOfKeys = numberOfKeys;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfKeys() {
		return this.numberOfKeys;
	}
	
	public void setNumberOfKeys(int numberOfKeys) {
		if (numberOfKeys < 15)
			this.numberOfKeys = 15;
		else
			this.numberOfKeys = numberOfKeys;
	}
	
	public int add(int a, int b) throws Exception {
		if (a > 0 && b > 0 && (a + b) < 0)
			throw new Exception();
		else if (a < 0 && b < 0 && (a + b) > 0)
			throw new Exception();
		else
			return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		if (b == 0)
			throw new ArithmeticException();
		else
			return (double)a / b;
	}
	
	
//	public static void main(String[] args) {
//		
//		Calculator calc = new Calculator("Jonny RadCalc", 15);
//		System.out.println(calc.getName());
//		System.out.println(calc.getNumberOfKeys());
//		
//		System.out.println(calc.add(Integer.MAX_VALUE, 1));
//		System.out.println(calc.subtract(Integer.MIN_VALUE, 1));
//		System.out.println(calc.multiply(100000, 100000));
//		System.out.println(calc.divide(2, 5));
//	
//
//	}

}
