package day12_stringmanupalation;
import java.util.Scanner;
public class C4_IndexOf {
	public static void main(String[] args) {
		// IndexOf() methodu bize istedigimiz karakter(lerin) indexini dondurur
		String str = "Java ogren, is sahibi ol";
		System.out.println(str.charAt(6)); // g
		System.out.println("char arama: " + str.indexOf('g')); // 6
		System.out.println("String arama: " + str.indexOf( "g")); // 6
		System.out.println("Birden fazla karakterle String arama: " + str.indexOf("is")); // 12
		System.out.println("Birden fazla ayni karakter varsa: " + str.indexOf("a")); // ilk buldugu index 1
		System.out.println("Baslangic index ile sonuc: " + str.indexOf('a', 4)); // ilk 4 karakteri atlayip a'yi arar  16
		System.out.println("Olmayan harf ya da karakter ile arama: " + str.indexOf("dert"));  // -1
		//kullanicidan bir cumle isteyiniz, case sensitive olmadan java kelimesini icerip icermedigini yazdirin
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir cumle giriniz: ");
		String cumle = scan.nextLine().toLowerCase();
		int sonuc = cumle.indexOf("java"); // java varsa, ilk java kelimesinin indexini yoksa -1 dondurur
		System.out.println(sonuc == -1 ? "java icermiyor" : "java iceriyor");
		if (cumle.indexOf("java") >=0) { // java kelimesinin index'inin 0 veya daha buyuk oldugunu kontrol eder
			System.out.println("Cumle java iceriyor...");
		} else {
			System.out.println("Cumle java icermiyor!");
		}
		scan.close();
	}
}
