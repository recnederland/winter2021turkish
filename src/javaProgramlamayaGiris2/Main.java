package javaProgramlamayaGiris2;

public class Main {

	public static void main(String[] args) {
		// Method Overloading
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(2, 3));
		dortIslem.topla(2, 5, 3);
		System.out.println(dortIslem.topla(2, 5, 3));
	}
	

}
