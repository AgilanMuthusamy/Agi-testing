
public class Return {

	int car;
	String animal;
	int price;

	void run() {

		int total = price + 100;
		System.out.println(total);

	}
	void check() {
		String abc = animal +"is the good boy";
		System.out.println(abc);
	}
	
	void alpha(String var) {
		System.out.println(var);
		
	}

	public static void main(String[] args) {
		Return obj = new Return();
		obj.car = 56;
		obj.animal = "Penguin";
		obj.price = 69;
		obj.run();
		obj.animal="karthi";
		obj.alpha("Buy Daikin AC");
	}
}