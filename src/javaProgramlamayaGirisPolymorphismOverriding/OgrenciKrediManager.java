package javaProgramlamayaGirisPolymorphismOverriding;

public class OgrenciKrediManager extends BaseKrediManager{
	
	public double hesapla(double tutar) {
		// Burada BaseKrediManager'dan aldigimiz mirasi overriding ile ezebilir degeri degistirebiliriz
		return tutar * 1.10;
	}

}
