package org.system;

public class Desktop1 implements Hardware, Software {
	public void DesktopModel() {
		System.out.println("lenovo");
	}

	public void SoftwareResources() {
		System.out.println("win dows10");
	}

	public void HardwareResources() {
		System.out.println(" apple 10");
	}

	public static void main(String[] args) {
		Desktop1 obj = new Desktop1();
		obj.DesktopModel();
		obj.HardwareResources();
		obj.SoftwareResources();

	}

}
