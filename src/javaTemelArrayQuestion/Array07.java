package javaTemelArrayQuestion;
import java.util.Arrays;
public class Array07 {
	public static void main(String[] args) {
		// Array'in elemanlarini kucukten buyuge siralamak
		int [] numbers = {9, 9, 1};
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
