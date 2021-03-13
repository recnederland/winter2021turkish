package day22_constructor;

public class OtomobilRunner {

	public static void main(String[] args) {
		// Biz simdi bir obje uretelim
		Otomobil oto1 = new Otomobil();
		oto1.vites ("otomatik");
		
		Otomobil oto2 = new Otomobil ("Kirmizi");
		System.out.println(oto2);
	}
}
