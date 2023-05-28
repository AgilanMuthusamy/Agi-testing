package org.college;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit limit is 4999 only");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.savings();

	}
}
