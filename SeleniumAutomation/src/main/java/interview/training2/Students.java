package interview.training2;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println(id + " " + name);

	}

	public void getStudentInfo(String name, String email, String phoneNumber) {
		System.out.println(name + " " + email + " " + phoneNumber);

	}

	public static void main(String[] args) {
		Students a = new Students();
		a.getStudentInfo(412414);
		a.getStudentInfo(41241410, "Agi");
		a.getStudentInfo("Agi", "agilan.msamy@gmail.com", "9629376573");
	}
}
