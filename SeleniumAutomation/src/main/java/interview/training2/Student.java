package interview.training2;

public class Student extends Department {
	public void studentName() {
		System.out.println("agi");
	}

	public void studentDept() {
		System.out.println("EEE");
	}

	public void studentId() {
		System.out.println("412414105001");
	}

	public static void main(String[] args) {
		Student a = new Student();
		a.studentName();
		a.studentId();
		a.studentDept();
		a.collegeName();
		a.collegeRank();
		a.collegeCode();
		a.deptName();
	}
}
