package day17_forloop;
import java.util.Scanner;
public class C1_ForLoop2 {
	public static void main(String[] args) {
		/*	 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
			 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz: ");
		int sayi = scan.nextInt();
		
		if (sayi <= 0) {
			System.out.println("Lutfen pozitif bir tam sayi giriniz!");
		} else {
			rakamlarToplamiHesapla(sayi);  // girilen sayinin rakamlar toplami int
		}
		scan.close();
	}
	
	private static int rakamlarToplamiHesapla(int sayi) {
		// 
		int rakamlarToplami = 0;
		String sayi2=sayi+"";  // bu sekilde bunu bir string yapmis olduk
		for (int i = 0; i <= sayi2.length(); i++) {     //         for (int i = 1; i < Integer.SIZE; i++) 
			rakamlarToplami +=sayi%10;
			sayi/=10;
		}	
		return rakamlarToplami;
	}
}
