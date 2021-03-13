package javaProgramlamayaGirisTinterface1;

public class Main {

	public static void main(String[] args) {
		// Bir class birden fazla class'a interfe edilebilir
		// Abstractlar gibi bunlar da new'lenemezler
		// Bu nedenle polimorphism yapmaliyiz
		ICustomerDal customerDal = new OracleCustomerDal();
	
	}

}
