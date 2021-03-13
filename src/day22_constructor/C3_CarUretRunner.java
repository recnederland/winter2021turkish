package day22_constructor;

public class C3_CarUretRunner {

	public static void main(String[] args) {
		// Bu class icinde C2_CarUret classindan obje uretebilir miyiz? EVET
		// CarUret bir kalip gibidir oradauretileni bu class'da kullaniriz
		C2_CarUret car1 = new C2_CarUret();
		car1.model = "Toyota";
		car1.marka = "Corolla";
		car1.yil = 2010;
		car1.kazasiVarMi = true;
		
		System.out.println(car1.model + " " + car1.marka + " " + car1.yil + " " + car1.kazasiVarMi);
		
		car1.yakit("Benzin");
		car1.vites("duz");
	}
}
