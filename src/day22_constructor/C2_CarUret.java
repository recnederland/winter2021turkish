package day22_constructor;
public class C2_CarUret {
	// Constructur bu class'da nerede?
	// su anda bu class'da gorunur bir constructor yok
	// bir class olusturuldugunda java bu class'dan bir obje uretilecegini bilir
	// Ve bu nedenle default olarak gorunmeyen bir DEFAYLT CONSTRUCTOR class'a yerlestirir
	// Default constructor parametresizdir dolayisila sadece hic bir ozelligi tanimlanamayan
	// objeler uretir (slayt ornegimizde ki tsort gibi)
	// Default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir.
	
	// Eger sonradan kendimiz bir constructor yazarsak java default constructor'i gecersiz kilar, iptal eder
	
	// Bir constructor olusturalim
	C2_CarUret(){
		
	}
	// Ozellikleri nelerdir bu constructor'larin:
	// 1- ISmi class ile ayni olmalidir, buyuk harfle baslar
	// 2- Return type'a sahip degildir
	// 3- Parantez sarttir ancak icinde parametre olmasiopsiyoneldir
	// 4- Bir constructor olusturuldugunda kimlarin kulllanacagini Access modifier belirler. Birsey yazmazsak default..
	
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;		
	// bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
    // bu class'da olusturulacak objelere ait tum ozellikler olur
    // bu class direk calistirilmayacagi icin main method olmasa da olur
    // (Kaliphane gibidir)
	public void yakit(String yakit) {  // method isimleri kucuk harfle baslar
		// TODO Auto-generated method stub
		System.out.println("Araba hareket etmek icin " + yakit + "kullanir.");
	}
	public void vites(String vites) { //method
		// TODO Auto-generated method stub
		System.out.println("Araba hareket etmek icin " + vites + "kullanir.");
	}	
}
