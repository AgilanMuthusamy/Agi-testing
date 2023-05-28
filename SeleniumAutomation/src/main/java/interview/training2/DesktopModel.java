package interview.training2;

public class DesktopModel implements HardWare, Software {

	public void Desktop() {
		// TODO Auto-generated method stub
		System.out.println("hp");
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("software");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardware");
	}

	public static void main(String[] args) {
		DesktopModel a = new DesktopModel();
		a.Desktop();
		a.hardwareResources();
		a.softwareResources();

	}

}
