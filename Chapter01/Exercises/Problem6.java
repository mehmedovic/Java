/****************
Exercise 1-6
Date: July 21, 2015
Senol Mehmedovic 
*****************/

public class Problem6 {
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
	public static void main(String[] args){
		topHalf();
		separation();
		bottomHalf();
	}
}