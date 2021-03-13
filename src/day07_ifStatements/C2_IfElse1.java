package day07_ifStatements;
import java.util.Scanner;
public class C2_IfElse1 {
	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini alin
		// uzunluklar esitse Kare, degilse Kara degil yazdirin		
		Scanner scan = new Scanner (System.in);
		System.out.println("Dikdorgenin kisa ve uzun kenar uzunlugunu giriniz: ");
		
		int kisaKenar = scan.nextInt();
		int uzunKenar = scan.nextInt();
		
		if(kisaKenar == uzunKenar) {
			System.out.println("Kare");
		}else {
			System.out.println("Dikdortgen");
			scan.close();
		}
	}
}
