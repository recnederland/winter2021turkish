package day22_constructor;

public class ParametreliConstructorRunner {

	public static void main(String[] args) {
		// Parametreli constructor'lari burada kullanabilmek icin kalip class'da this ile esitlemek gerekir
		ParametreliConstructor oto1 = new ParametreliConstructor(); //ParametreliConstructor parametresiz 2.'yi kullanir
		System.out.println(oto1.marka + " " + oto1.model + " " + oto1.yil + " " + oto1.kazasiVarMi);
		
		ParametreliConstructor oto2 = new ParametreliConstructor(2015); // 
		System.out.println(oto2.marka + " " + oto2.model + " " + oto2.yil + " " + oto2.kazasiVarMi);
		
		ParametreliConstructor oto3 = new ParametreliConstructor("Toyota", "Corolla", 2010, true);
		System.out.println(oto3.marka + " " + oto3.model + " " + oto3.yil + " " + oto3.kazasiVarMi);		
	}
}
