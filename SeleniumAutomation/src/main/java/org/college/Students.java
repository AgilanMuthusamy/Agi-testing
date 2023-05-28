package org.college;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println(id + " " + name);

	}

	public void getStudentInfo(String email, String phonenumber) {
		System.out.println(email + " " + phonenumber);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(412414);
		obj.getStudentInfo(412414, "Agi");
		obj.getStudentInfo("agilan.msamy@gmail.com", "9629376573");

	}

}
