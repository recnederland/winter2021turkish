package day09_ternary;
import java.util.Scanner;
public class C5_Ternery5 {

	public static void main(String[] args) {
		// Kullanicidan dortgenin uzunlugunu ve genisligini alin ve girilen degerlere gore kare veya dikdorgen oldugunu blirtin
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dortgenin birinci ve ikinci kenar uzunluklarini giriniz: ");
		
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		System.out.println("Girmis oldugunuz kenar uzunluklarina gore dortgeniniz bir: " + (kenar1 == kenar2 ? "Kare" : "Dikdortgen") + "dir.");
		
		scan.close();
	}
}
