/****************
Exercise 1-7
Date: July 21, 2015
Senol Mehmedovic 
*****************/

public class Problem7 {
	public static void topHalf() {
		System.out.println("  ________   ");
		System.out.println(" /        \\ ");
		System.out.println("/          \\");
	}
	public static void bottomHalf() {
		System.out.println("\\          /");
		System.out.println(" \\________/ ");
	}
	public static void separation() {
		System.out.println("-\"-'-\"-'-\"-\"");
	}
	public static void main(String[] args) {
		topHalf();
		bottomHalf();
		separation();
		topHalf();
		bottomHalf();
		separation();
		bottomHalf();
		topHalf();
		separation();
		bottomHalf();
	}
}