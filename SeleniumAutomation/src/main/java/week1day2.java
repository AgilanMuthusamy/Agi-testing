import java.util.Arrays;

public class week1day2 {

	public static void main(String[] args) {
  int[] numArr = {100,49,3398,34,1,267};
  
  int length = numArr.length;
  System.out.println("length of the array:" + length);
  
  
  
  System.out.println("for loop");
  for (int i = 0; i < numArr.length; i++) {
System.out.println(numArr[i]);

}
  Arrays.sort(numArr);
  System.out.println("after sort");
  for (int i = 0; i < numArr.length; i++) {
	
	  System.out.println(numArr[i]);
	  
	}
System.out.println("second large number:" + numArr[length-2]);
System.out.println("second small number:" + numArr[1]);
;

	}
	
	
	
}



