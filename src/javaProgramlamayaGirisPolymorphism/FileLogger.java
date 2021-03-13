package javaProgramlamayaGirisPolymorphism;

public class FileLogger extends BaseLogger{
	// Polymorphism - cokbicimlilik demektir
	// override edildiler
	public void log(String message) {
		System.out.println("Logged to base: " + message); // Mesaji veri tabanina logladim
		
	}

}
