package week1.day1;

public class Armstrongnumber {

	public static void main(String[] args) {
		int number = 153;
		int agilan;
		int adhav =0;
		while (number > 0) {
			agilan = number % 10;
			adhav = adhav + (agilan * agilan * agilan);
			number = number / 10;
		}
		if (number == adhav) {
			System.out.println("is a armstrong number");
		} else {
			System.out.println("is not armstrong number");

		}
	}

}
