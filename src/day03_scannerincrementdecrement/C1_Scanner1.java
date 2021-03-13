package day03_scannerincrementdecrement;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Lutfen sadece isminizi giriniz: ");
			
			String name = scan.nextLine();
			
			System.out.println("lutfen sadece soyisminizi giriniz: ");
			
			String surname = scan.nextLine();
			
			System.out.println(name + " " + surname);
			System.out.println(name + true + surname);
			System.out.println(name + 'a' + surname);
			System.out.println(name + "a" + surname);
			System.out.println(name + 1 + surname);
			System.out.println(name + "1" + surname);
			
			int sayi1 = 5;
			char sayi2 = 15;
			String deneme = "demek";
			
			System.out.println(name + sayi1+ surname);
			System.out.println(name + sayi2 + surname);
			System.out.println(name + deneme + surname);
			System.out.println(sayi1 + name + " " + surname);
			System.out.println(sayi2 + name + " " + surname);
			System.out.println(deneme + name + " " + surname);
			scan.close();
			
	}

}
