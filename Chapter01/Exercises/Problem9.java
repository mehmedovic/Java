/****************
Exercise 1-9
Date: July 21, 2015
Senol Mehmedovic 
*****************/

public class Problem9 {

	public static void fiveStar() {
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void twoStar() {
		System.out.println(" * * ");
	}
	public static void oneStar() {
		System.out.println("  *  ");
	}
	public static void patternOne() {
		fiveStar();
		twoStar();
		oneStar();
		twoStar();
	}
	public static void main(String[] args){
		patternOne();
		System.out.println();
		patternOne();
		fiveStar();
		System.out.println();
		oneStar();
		oneStar();
		oneStar();
		patternOne();

	}
}