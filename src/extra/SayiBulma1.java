package extra;
public class SayiBulma1 {
	public static void main(String[] args) {
		// Dizi icinde istenen sayinin olup olmadigini bulma
		int[] sayilar = new int[] {1, 2, 5, 7, 9};
		int aranacak = 6;
		
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