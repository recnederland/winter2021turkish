package javaTemelArrayQuestion;
public class Array03 {
	public static void main(String[] args) {
		// Bir array'in icindeki butun sayilari toplayiniz
		int arr [] = {12, 7, 5, -2, 10};
		int sum = 0;
		for (int i : arr) {
			sum =sum+i;
		}
		System.out.println(sum);
	}
}
