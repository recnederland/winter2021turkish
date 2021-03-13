package javaProgramlamayaGirisPolymorphism;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger; 
	}
	
	public void add() {
		// 2 asama 
		System.out.println("Musteri eklendi");
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.Log("Log mesaji burada");
		this.logger.log("log mesaji");
	}

	////////////////////// eski sistem altta /////////////

//	public void Add() {
//		// 2 asama icin bunun yerine
//		System.out.println("Musteri eklendi");
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.Log("Log mesaji burada");
//	}

}
