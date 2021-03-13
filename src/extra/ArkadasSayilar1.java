package extra;
public class ArkadasSayilar1 {
	public static void main(String[] args) {
		// Verilen sayilarin arkadas sayi 
		// (kendisinden baska pozitif tam bolenleri birbirine esit olan sayilar)
		// olup olmadigini ekrana yazdiran program
		// (220, 284), (1184, 1210), (2620, 2924) (5020, 5564), 
		 //(6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084)
		int sayi1 = 12285;
		int sayi2 = 14595;
		int toplam1 =0;
		int toplam2 =0;
		
		for (int i = 1; i < sayi1 ; i++) {
			if (sayi1 % i ==0) {
				toplam1 += i;
			}
		}
		for (int i = 1; i < sayi2 ; i++) {
			if (sayi2 % i ==0) {
				toplam2 += i;
			}
		}
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu iki sayi arkadas sayilardir");
		}else {
			System.out.println("Bu iki sayi arkadas sayilar degildir");
		}
	}
}
