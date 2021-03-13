package day07_ifStatements;
import java.util.Scanner;
public class C4_IfElse3 {
	public static void main(String[] args) {
		// Kullanicidan yasini sorup 65'den buyukse emekli olabilirsin,
		// Kucukse emekli olamazsin ekrana yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Yasinizi giriniz: ");
		int yas = scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Tebrik ederiz!!! Emekli olabilirsiniz");
		} else {
			System.out.println("Malesef henuz emekli olamazsiniz");
		}
		scan.close();
	}
}
