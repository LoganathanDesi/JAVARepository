package Inheritance;

public class CalculatorGen_2 extends CalculatorGen_1{
	public static void main(String [] args) {
		CalculatorGen_2 gen2Ins = new CalculatorGen_2();
		System.out.println (gen2Ins.gen1Addition(5, 6));
		System.out.println (gen2Ins.gen2Multiplication(5, 6));
	}

	public int gen2Multiplication(int a, int b) {
		int c;
		c = a * b;
		return c;
	}
	
}
