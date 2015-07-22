/****************
Exercise 1-1
Date: July 22, 2015
Senol Mehmedovic 
*****************/
public class Problem1 {
	public static void drawM() {
		System.out.println("M     M");
		System.out.println("MM   MM");
		System.out.println("M M M M");
		System.out.println("M  M  M");
		System.out.println("M     M");
		System.out.println("M     M");
		System.out.println("M     M");
	}

	public static void drawIBar() {
		System.out.println(" IIIII");
	}

	public static void drawIShaft() {
		System.out.println("   I  ");
	}
	public static void drawI() {
		drawIBar();
		drawIShaft();
		drawIShaft();
		drawIShaft();
		drawIShaft();
		drawIShaft();
		drawIBar();
	}

	public static void drawSBar() {
		System.out.println(" SSSSS ");
	}

	public static void drawS() {
		drawSBar();
		System.out.println("S     S");
		System.out.println("S");
		drawSBar();
		System.out.println("      S");
		System.out.println("S     S");
		drawSBar();

	}

	public static void drawP() {
		System.out.println("PPPPPP");
		System.out.println("P     P");
		System.out.println("P     P");
		System.out.println("PPPPPP");
		System.out.println("P");
		System.out.println("P");
		System.out.println("P");

	}

	public static void main(String[] args) {
		drawM();
		System.out.println();
		drawI();
		System.out.println();
		drawS();
		System.out.println();
		drawS();
		System.out.println();
		drawI();
		System.out.println();
		drawS();
		System.out.println();
		drawS();
		System.out.println();
		drawI();
		System.out.println();
		drawP();
		System.out.println();
		drawP();
		System.out.println();
		drawI();
	}
} 