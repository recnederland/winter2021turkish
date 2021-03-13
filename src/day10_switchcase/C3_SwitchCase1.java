package day10_switchcase;
import java.util.Scanner;
public class C3_SwitchCase1 {
	public static void main(String[] args) {
		// Kullanicidan bir rakam isteyin ve rakami yazi ile yazdirin
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tamsayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		if (sayi <0 && sayi >9) {
			System.out.println("Girdiginiz karakter rakam degil! Kontrol ediniz...");
		} else if(sayi==1){
			System.out.println("Bir");
		}else if(sayi ==2) {
			System.out.println("Iki");
		}else if(sayi == 2) {
			System.out.println("Uc"); 
		}else if(sayi == 4) {
			System.out.println("dort");
		}else if(sayi == 5){
			System.out.println("Bes");
		}else if(sayi == 6) {
			System.out.println("Alti");
		}else if(sayi == 7) {
			System.out.println("Yedi");
		}else if(sayi == 8) {
			System.out.println("Sekiz");
		}else if(sayi == 9) {
			System.out.println("Dokuz");
		}else if (sayi == 0){
			System.out.println("Sifir");
		}
		//soruyu switchcase ile yapalim. <  y ds > kullsnilmsx
		switch (sayi) {
		case 0:
			System.out.println("Sifir");
			break;
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("uc");
			break;
		case 4:
			System.out.println("dort");
			break;
		case 5:
			System.out.println("bes");
			break;
		case 6:
			System.out.println("alti");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8:
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;

		default:System.out.println("Giirdiginiz karakter rakam degil! Kontrol edip tekrar deneyiniz");			
		}
		scan.close();
	}
}
