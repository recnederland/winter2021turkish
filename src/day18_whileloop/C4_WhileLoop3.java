package day18_whileloop;
import java.util.Scanner;
public class C4_WhileLoop3 {
	public static void main(String[] args) {
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve 
		// baslangic harfinden baslayip bitis harfinde biten tum harfleri 
		// buyuk harf olarak ekrana yazdirin. 
		// Kullanicinin hata yapmadigini farz edin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen baslangic harfini giriniz: ");
		char str1=scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen bitis harfini giriniz: ");
		char str2 = scan.next().toUpperCase().charAt(0);
		// foor ile cozum
		for (char i = str1; i <= str2; i++) {
			System.out.print(i + " ");
		}
		// while loop ile
		System.out.println(" ");
		while (str1 <= str2) {
			System.out.print( str1 + " ");
			str1++;
		}
		scan.close();
	}
}
