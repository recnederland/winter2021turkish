package javaTemelArrayQuestion;
import java.util.Arrays;
public class Array06 {
	public static void main(String[] args) {
		// Bir string olusturunuz, bu string'de ki character'leri yeni for-each loop kullanarak yazdiriniz		
		String str = "Hello world";
		String harf [] = str.split("");
		
		System.out.println(Arrays.toString(harf));
		for (String w : harf) {
			System.out.print(w);
		}
	}
}
