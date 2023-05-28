package interview.training;

public class Calculator {

	public void add() {
		int a = 15;
		int b = 10;
		int c = 5;
		int d = a + b + c;
		System.out.println("addition:  " + d);

	}

	public void sub() {
		int a = 78;
		int b = 20;
		int c = a - b;
		System.out.println("subraction: " + c);

	}

	public void mul() {
		double a = 5.5;
		double b = 2.5;
		System.out.println("multiplication: " + a * b);

	}

	public void div() {
		float a = 55f;
		float b = 25f;
		System.out.println("divide: " + a / b);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add();
		obj.mul();
		obj.div();
		obj.sub();

	}
}