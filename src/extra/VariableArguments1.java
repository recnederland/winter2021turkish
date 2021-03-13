package extra;
public class VariableArguments1 {
	public static void main(String[] args) {
		// Variable argumets ornegi
		// koleksiyonlar nesnel yapilar da kullanilabilir bunun yerine
		// test edilebilirligi zayiftir
		int toplam = topla(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);
	}
	// ... ile variable argument olusturabiliriz. Bu bir integer array'dir
	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi: sayilar) {
			toplam += sayi;			
		}
		return toplam;
	}
}
