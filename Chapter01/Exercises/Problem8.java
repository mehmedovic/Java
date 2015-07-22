/****************
Exercise 1-8
Date: July 21, 2015
Senol Mehmedovic 
*****************/

public class Problem8 {
	public static void triangle() {
		System.out.println("   /\\       /\\");
		System.out.println("  /  \\     /  \\");
		System.out.println(" /    \\   /    \\");
	}
	public static void square() {
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
	}
	public static void unitedStates() {
		System.out.println("|United| |United|");
		System.out.println("|States| |States|");
	}
	public static void main(String[] args){
		triangle();
		square();
		unitedStates();
		square();
		triangle();
	}
}