package day07_ifStatements;
import java.util.Scanner;
public class C7_IfElseIf2 {
	public static void main(String[] args) {
		//Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin 
		// toplamini yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
		//sayilarin ikisi  farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” 
		//yazdirin,  sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”  yazdirin.

		Scanner scan = new Scanner (System.in);
		System.out.println("Iki sayi giriniz");	
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		
		if (s1 == 0 || s2 == 0) {
			System.out.println("sifir carpmaya gore yutan elemandir");
		}else if(s1>0 && s2 >0 ){
			System.out.println(s1  +  s2);
		}else if (s1 < 0 && s2 < 0) {
			System.out.println(s1 * s2);
		}else {
			System.out.println("farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin");
		}
		scan.close();
	}
}
