package javaProgramlamayaGirisPolymorphism;
public class Main {
	public static void main(String[] args) {
		// Polymorphisme'de benzer gorevleri goren classlarla yapilir
		// Loglama yontemi
		
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log mesaji");
		
		//////////////  sonraki asama   //////////////
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(),
//				new ConsoleLogger()};
//		
//		for (BaseLogger logger:loggers) {
//			logger.Log("Log mesaji");
//		}
		
		/////////////  2 sama  ///////////////
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}
}
