class methods {
	int value;
	String name;
	int amount;

	void run() {
		System.out.println("the" + name + "marks in java is: " + value);

	}
	int run1() {
		int total = amount-15;
		return total;
	
	}
}

public class JavaBasic {

	public static void main(String[] args) {
		methods obj = new methods();
		obj.name = "Agi";
		obj.value = 99;
		obj.run();
		obj.amount=929;
		int run1 = obj.run1();
		System.out.println("Amount of run1 " + run1);

//FORLOOP
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("output number is: %d\n", i);// %d become I here put comma,then\n represents next line }
//		}
//
////WHILELOOOP
//		int amount = 0;
//		while (true) {
//			System.out.println("in the loop");
//			if (amount == 9) {
//				break;
//
//			}
//			amount++;
//			System.out.println("Out Of the loop");
//		}
//
////SCANNER INPUT GIVEN BY USER AT CONSOLE
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Giver Your Text Below");
//		String nextLine = scan.nextLine();
//		System.out.println("Your Text Is: " + nextLine);
//
////SCANNERUSING DOWHILE
//
//		int num = 0;
//		Scanner scan1 = new Scanner(System.in);
//		do {
//			System.out.println("ENTER YOUR NUMBER");
//			num = scan1.nextInt();
//		} while (num != 77);
//		System.out.println("Number equal to" + num);
//
////SWITCH STATEMENT datatype must be in char,byte,short,int and string
//
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("Type your String: ");
//		String nextLine2 = scan2.nextLine();
//		switch (nextLine2) {
//		case "Agi":
//			System.out.println("Agilan java code Head");
//			break;
//
//		case "Mukilan":
//			System.out.println("Head Of Python");
//			break;
//
//		default:
//			System.out.println("no related");
//		}
//		
////MULTI DIMENSIONAL ARRAY
//		
//		int[][] multi = {{12,4,6},{122,15,19,8},{14,44,22}};
//		for (int i = 0; i < multi.length; i++) {
//			System.out.println("ivalue: "+i);
//			for (int j = 0; j < multi[i].length; j++) {
//				System.out.print(multi[i][j]+"\t");//t leave more space
//				
//			}
//			System.out.println("");
//		}
	}
}

