package day09_ternary;
import java.util.Scanner;
public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola �Kucuk Harf� , 
		// buyuk harfse consola �Buyuk Harf� yoksa �girdiginiz karakter harf degil� yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir harf giriniz: ");
		
		char harf = scan.next().charAt(0);
		
		System.out.println( 'a'< harf && 'z' >harf ? ( 'a'<= harf && 'z' > harf ? "kucuk harf" :  "girdiginiz karakter harf degil") : ('A'<= harf && 'Z' > harf ? "buyuk harf": "girdiginiz karakter harf degil"));
		scan.close();	
	}
}
