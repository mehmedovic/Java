/****************
Exercise 2-2
Date: July 22, 2015
Senol Mehmedovic 
*****************/

public class Problem2 {
	public static void noMultMethod() {
		int difference=1;
		int prevSum=0;
		for(int i=1;i<=10;i++) {
			System.out.println(prevSum+difference);
			prevSum+=difference;
			difference+=2;
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*i);
		}
		noMultMethod();
	}
}