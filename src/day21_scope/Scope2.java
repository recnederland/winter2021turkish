package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		// Static variable'lar ve methodlar, icin object olusturmaya gerek yoktur.
		// Baska bir class'dan static variable'lara ulasmak istedigimizde
		// Ulasmak istedigimiz Class'in adi . static variable adi yazmak yeterlidir
		
		System.out.println(Scope1.okulAdi); // YIldiz Koleji
		System.out.println(Scope1.okulId);  // 1201
		
		// Java Run Time bir programdir. Calistiginda degeri olusturur. Run dedigimizde neresi calisiyorsa orasi degisir
		// Scope2 calistiginda Scope1 kendiliginden calismaz.
		// Dolasiyla en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi = "Mehmet Koleji";
		System.out.println(Scope1.okulAdi); // Mehmet Koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);

		
		// degeri nerde degiştirirsek değistirelım static deger degişecek diyoruz o zaman dogru mudur
		

	}

}
