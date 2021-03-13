package javaProgramlamayaGirisSonuc1;

public class CustomerManager {
	

		BaseDatabaseManager databaseManager;
		
		public void getCustomers() {
			databaseManager.getData();
		}
		// Alttakini kullanirsak Oracle bagimli oluruz
//		OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//		oracleDatabaseManager.getData();
	
}
