package day17_forloop;
import java.util.Scanner;
public class C3_ForLoop3 {
	public static void main(String[] args) {
		// Kullanicidan 35'dan kucuk pozitif bir sayi alin
		// girilen sayinin faktoryelini hesaplayip yazdiran bir method olusturun
		// 6 ! = 1 * 2 * 3 * 4 * 5 *6 = 720
		Scanner scan = new Scanner(System.in);
		System.out.println("35'tan kucuk pozitif bir tamsayi giriniz: ");
		int sayi = scan.nextInt();
		if (sayi <= 0 || sayi >= 35) {
			System.out.println("Lutfen gecerli bir sayi giriniz: ");
		} else {
			sayininFaktoriyeli(sayi);
		}
		scan.close();
	}
	public static void sayininFaktoriyeli(int sayi) {
		long faktoriyel = 1;  // bos kutu
		for (int i = 1; i <= sayi; i++) {
			faktoriyel *=i;
		}
		System.out.println(faktoriyel);		
	}	
}
