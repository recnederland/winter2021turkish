package javaTemelArrayQuestion;
public class Array04 {
	public static void main(String[] args) {
		// Array'in icinde kac tane 4 sayisi gectigini yazan program		
		int ars[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 4};
		int counter =0;		
		for (int w : ars) {
			if (w == 4) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
