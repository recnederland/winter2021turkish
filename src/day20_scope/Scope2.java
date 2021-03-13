package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scope1 obj4 = new Scope1();
		// Onceki classtan degerleri kullanabiliriz
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		
		obj4.isim="Recep";
		obj4.soyisim="Bayram";
		
		System.out.println(obj4.isim + " " + obj4.soyisim);
	}	
}
