package javaProgramlamayaGirisInheritance2;

public class KrediUI {
	
//	public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
//		ogretmenKrediManager.Hesapla();
//	} Bunun yerine asagidaki kullanilabilir
	
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
	}

}
