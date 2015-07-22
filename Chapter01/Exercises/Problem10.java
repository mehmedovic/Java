/****************
Exercise 1-10
Date: July 21, 2015
Senol Mehmedovic 
*****************/

public class Problem10 {
	
	static String STRING="All work and no play makes Jack a dull boy.";

	public static void printTenString() {
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);
		System.out.println(STRING);

	}

	public static void printHundredString() {
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
		printTenString();
	}
	public static void main(String[] args) {
		printHundredString();
		printHundredString();
		printHundredString();
		printHundredString();
		printHundredString();
		printHundredString();
		printHundredString();
		printHundredString();
		printHundredString();
		printHundredString();
		System.out.println("Congratulations, you've printed your string 1000 times.");
	}
} 