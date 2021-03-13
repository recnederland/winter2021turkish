package day07_ifStatements;
import java.util.Scanner;
public class C5_IfElse4 {
	public static void main(String[] args) {
		// Kullanicidan ucgenin kenar uzunluklarini alin 
		// Uc kenar esitse eskenar, degilse eskenar degil yazdirin.
		Scanner scan = new Scanner (System.in);
		System.out.println("Ucgenin uc kenar uzunlugunu sirayla giriniz: ");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		if (kenar1 == kenar2 && kenar2 == kenar3) {
			System.out.println("Girmis oldugunuz kenar uzunluklarina gore bu ucgen eskenar ucgendir.");
		} else {
			System.out.println("Girmis oldugunuz kenar uzunluklarina gore bu ucgen eskenar ucgen degildir..");
		}
		scan.close();
	}
}
