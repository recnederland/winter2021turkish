package day22_constructor;

public class ParametreliConstructor {

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public ParametreliConstructor(int yil) { // 1
		this.yil = yil;
	}
	public ParametreliConstructor() { // 2
		
	}
	public ParametreliConstructor(String marka, String model) { // 3
		
	}
	public ParametreliConstructor(String marka, String model, int yil, boolean kazasiVarMi) { //4
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.kazasiVarMi = kazasiVarMi;
	}
	public void yakit(String yakit) {  // method isimleri kucuk harfle baslar
		// TODO Auto-generated method stub
		System.out.println("Araba hareket etmek icin " + yakit + "kullanir.");
	}
	public void vites(String vites) { //method
		// TODO Auto-generated method stub
		System.out.println("Araba hareket etmek icin " + vites + "kullanir.");
	}

}
