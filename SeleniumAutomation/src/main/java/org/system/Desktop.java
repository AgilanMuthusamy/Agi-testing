package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("20inch");

	}
	public static void main(String[] args) {
		Desktop value = new Desktop();
		
		value.computerModel();
		value.desktopSize();
	}

}
