package extra;
public class Methods1 {
	public static void main(String[] args) {
		// Method main method icinde cagirilmalidir
		// function kod tekrarini ve kalabalikligini onler		
		sayiBulmaca();
	}
	// Dizi icinde istenen sayinin olup olmadigini bulma
	// camel casing: isimlerin ilk harfi kucuk diger tum kelimeler bitisik ilk harfi buyuk
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1, 2, 5, 7, 9};
		int aranacak = 5;
		
		boolean varMi = false;
		
		for(int sayi : sayilar) { // bu sekilde dizilerin tum elemanlarini gezebiliriz
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayi mevcuttur.");
		}else {
			System.out.println("Sayi mevcut degildir.");
		}		
	}
}
