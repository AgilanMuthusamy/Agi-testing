package week1.day1;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculatorObj = new Calculator();

		System.out.println(calculatorObj.add(3, 4, 5));

		System.out.println(calculatorObj.sub(9, 6));

		System.out.println(calculatorObj.mul(33.56, 22.1));
		System.out.println(calculatorObj.div(6789, 20));

	}

}
