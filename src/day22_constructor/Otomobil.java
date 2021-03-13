package day22_constructor;
public class Otomobil {
	// biz bir constructor olusturdugumuzda java default olani yok eder
    // dolayisiyla biz bir constructor olusturdugumuzda mutlaka 
    // default constructor'in yerine de bir constructor yazmaliyiz
    // default constructor'in yerine alttaki gibi bir constructor yazmaliyiz
	public Otomobil(String renk) { // parametreli constructor, DIKKAT biz bunu olusturdugumuzda default constructor iptal olur		
	}
	// Dolayisiyla bir constructor olusturdugumuz anda default constructor yerine de bor cosntructor yazmaliyiz
	public Otomobil() {		
	}	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	public void yakit(String yakit) {  // method isimleri kucuk harfle baslar
		// TODO Auto-generated method stub
		System.out.println("Araba hareket etmek icin " + yakit + "kullanir.");
	}
	public void vites(String vites) { //method
		// TODO Auto-generated method stub
		System.out.println("Araba hareket etmek icin " + vites + "kullanir.");
	}
}
