package day21_scope;
public class Scope1 {
	static int okulId = 1201;
	static String okulAdi = "Yildiz Koleji";
	static boolean acikMi;	
	public static void main(String[] args) {
		// Yukaridaki static variabl'lari main method da static oldugu icin rahatlikta burada kullanalabiliriz
		// static variable'lar class level'da olusturuldugu icin class'in her yerinden kullanilabilirler
		// instance variable'lar static olmayan method'larda direkt kullanilabiliyorken. static merhodlar'da
		// object olusturularak kullanilabilirler
		// static variable'lar ise ister static isterse static olmayan tum method'lardan direk kullanilabilirler
		
		System.out.println(okulAdi + " " + okulId + " " + acikMi ); // 1201 Yildiz Koleji false
		okulId = 1202;
		acikMi = true;
		
		staticMethod();
		
		System.out.println(okulAdi + " " + okulId + " " + acikMi ); // 1203 Yildiz Koleji true
	}	
	public static void staticMethod() {
		System.out.println(okulAdi + " " + okulId + " " + acikMi ); // 1202 Yildiz Koleji true
		okulId = 1203;
				
	}	
	public void method() {
		okulId = 1205;
	}
}
