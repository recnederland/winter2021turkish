package day02_scanner;

import java.util.Scanner;


public class C2_Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Alanini hesaplamak istediginiz dairenin yari capi degerini giriniz: ");
			double yaricap = scan.nextDouble();
			System.out.println("Dairenin alani: " + 3.14 * yaricap * yaricap);
			
			scan.close();
		
	}

}
