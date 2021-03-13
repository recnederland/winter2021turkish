package extra;
public class FunctionParemetersVoid1 {
	public static void main(String[] args) {
		// String methodlardan substring ile metnin bir kismini alabiliriz
		// Burada bir atama yaparak deger dondurulmesini/ return etmesini sagliyoruz
		String mesaj = "Java cok guzel!";
		String yeniMesaj = mesaj.substring(0, 2);
		// sehirVer string oldugundan burada kullanilabilir
		String enYeniMesaj = sehirVer();
		
		// topla functionunu int ile kullanabilirirm
		int sayiTopla = topla();
		// carp parametreli function ise cagirirken esit sayida parametre kullanmaliyiz
		int sayiCarp = carp(3, 5);
		
		System.out.println(mesaj + "\n" +yeniMesaj +"\n" + enYeniMesaj + "\n" +sayiTopla + "\n" +sayiCarp);
	}
	// Void Fonksiyonlari bize bir islemi yapip sonuc verir birsey uretmez
	// void olan methodlar stringlere eklenip kullanilamaz
	// String yeniMesaj = ekle();   ornegin yazilamaz
	// void bir degiskene atanamaz
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Guncellendi");
	}
	// int deger dondurecek bir method/ function/ operation yazalim
	public static int topla() { // bu da yukarida main method icinde kullanilmaz
		return 5; // return olarak 5 dondur
	}
	public static int carp(int a, int b) {
		return a * b;
	}
	public static String sehirVer() {
		return "Istanbul";
	}
}
