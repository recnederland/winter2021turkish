package day03_scannerincrementdecrement;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen isminizi giriniz: ");
		
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Ilk harfiniz: "+ilkHarf);
		
		scan.close();
		
		
	}

}
