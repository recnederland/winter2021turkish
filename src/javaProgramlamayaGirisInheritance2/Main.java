package javaProgramlamayaGirisInheritance2;

public class Main {

	public static void main(String[] args) {
		// Inheritance miras almak
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		
//		ogretmenKrediManager.Hesapla();
		
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
//		TarimKrediManager();
//		OgretmenKrediManager();
//		AskerKrediMAnager();
		
	}
}
