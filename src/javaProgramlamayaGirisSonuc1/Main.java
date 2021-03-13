package javaProgramlamayaGirisSonuc1;

public class Main {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
// SOLID  Robert C. Martin (Uncle Bob/ Bob Amca) Michael Feathers
//Single Responsibility : Sınıflarımızın iyi tanımlanmış tek bir sorumluluğu olmalı.
//Open/Closed : Sınıflarımız değişikliğe kapalı ancak yeni davranışların eklenmesine açık olmalı.
//Liskov Substitution : Kodumuzda herhangi bir değişiklik yapmaya gerek kalmadan türetilmiş sınıfları (sub class) türedikleri ata sınıfın (base class) yerine kullanabilmeliyiz.
//Interface Segregation : Genel kullanım amaçlı tek bir kontrat yerine daha özelleşmiş birden çok kontrat oluşturmayı tercih etmeliyiz.
//Dependency Inversion : Katmanlı mimarilerde üst seviye modüller alt seviyedeki modüllere doğrudan bağımlı olmamalıdır.