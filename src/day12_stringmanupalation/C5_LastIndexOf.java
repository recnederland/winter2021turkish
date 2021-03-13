package day12_stringmanupalation;
import java.util.Scanner;
public class C5_LastIndexOf {
	public static void main(String[] args) {
		// Aranan degerin son gorunumunun indexini verir
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir cumle giriniz: ");
		String last = scan.nextLine();
		System.out.println(last.lastIndexOf('a'));
		scan.close();
	}
}
