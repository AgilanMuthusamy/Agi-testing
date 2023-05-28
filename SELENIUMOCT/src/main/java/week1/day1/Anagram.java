package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
   String s1 = "stops";
   String s2 = "potss";
   String a = "";
   String b = "";
   
   char[] chararr = s1.toCharArray();
   char[] chararr1= s2.toCharArray();
   
   Arrays.sort(chararr);
   Arrays.sort(chararr1);
   a= String.valueOf(chararr);
   b=String.valueOf(chararr1);
   
   if(a.equals(b)){
   System.out.println("The Values are Same");
    
	}else {
		System.out.println("The Values are Different");
	}
	}

}
