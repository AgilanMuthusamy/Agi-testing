package org.college;

public class Replace {

	public static void main(String[] args) {
		String sentence = "I am working with java8";
		String replaceAll1 = sentence.replaceAll(sentence.substring(8, 11), "abc");
		System.out.println(replaceAll1);

		String substring = sentence.substring(5, 14);
		System.out.println(substring);

	}

}
