package week1.day1;

public class Fibonaci {

	public static void main(String[] args) {
    

		int first1 = 0;
		int second2 = 1;
		int find;
		int count = 10;
		
		for (int i = 2; i <count; i++) {
			
			
			
			find = first1+second2;
			first1=second2;
			second2=find;
			System.out.println(find);
			
			
		}
		
		
		
		
	}

}
