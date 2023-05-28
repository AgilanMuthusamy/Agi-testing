package javaprogram;

public class ElementPresentInArrayOrNot {
	
	int num[]= {1,4,6,7,4,3};
	int elementPresent = 3;
	boolean found = false;
	
	public void forLoop() {
		for (int i = 0; i < num.length; i++) {
			if (num[i]==elementPresent) {
				System.out.println(num[i]);
				
			}
			
		}
		
		

	}
	public void forEachLoop() {
		for (int i : num) {
			if (i==elementPresent) {
				 found=true;
				
				break;
			}
			
			
		}if (found) {
			System.out.println("number present");
		
		}else {
			System.out.println("notpresnt");
		}

	}
	public static void main(String[] args) {
		ElementPresentInArrayOrNot obj =new ElementPresentInArrayOrNot();
		obj.forLoop();
		obj.forEachLoop();
	}

}
