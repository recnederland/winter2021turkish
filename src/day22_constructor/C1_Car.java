package day22_constructor;
public class C1_Car {
	// Bir arabanin ne gibi ozellikleri olabilir. Alttaki ozellikler arabaya gore degisebileceginden instance variable olmalidir
		String marka;
		String model;
		int yil;
		boolean kazasiVarMi;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1_Car car1 = new C1_Car(); // Constructor'a dayali obje uretelim bu satirda
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		// null null 0 false
		car1.marka = "Toyota";
		car1.model = "Corolla";
		car1.yil = 2010;
		car1.kazasiVarMi = false;
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		// Toyota corolla 2010 false
		C1_Car car2 = new C1_Car();
		car2.marka = "Opel";
		car2.model = "Asta";
		car2.yil = 2015;
		car2.kazasiVarMi = true;
		System.out.println(car2.marka + " " + car2.model + " " + car2.yil + " " + car2.kazasiVarMi);
		// Opel Astra 2015 true
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		// Toyota corolla 2010 false
		car1.kazasiVarMi = true;
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		// Toyota corolla 2010 true
	}
}
