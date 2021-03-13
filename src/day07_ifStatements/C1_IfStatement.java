package day07_ifStatements;
import java.util.Scanner;
public class C1_IfStatement {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz.
		// Sifirdan buyukse pozitif, yuzden kucukse "100'den kucuk sayi" , 1000'den buyukse "1000'den buyuk sayi" yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi = scan.nextInt();
		
		if(sayi>0) {
			System.out.println("Sayi pozitif");
		}
		if (sayi<100) {
			System.out.println("100'den kucuk sayi");
		}
		if (sayi>1000) {
			System.out.println("1000'den buyuk sayi");
		}
		scan.close();
	}
}
