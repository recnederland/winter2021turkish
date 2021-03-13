package day07_ifStatements;
import java.util.Scanner;
public class C3_IfElse2 {
	public static void main(String[] args) {
		// Kullanicidan bir karakter girmesini isteyin
		// harf olup olmadigini yazdirin
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir karakter giriniz");
		
		char karakter = scan.next().charAt(0);
		if(( karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
			System.out.println("Girdiginiz karakter bir harf");
		}else {
			System.out.println("Girdiginiz karakter bir harf degil");
		}
		scan.close();
	}
}
