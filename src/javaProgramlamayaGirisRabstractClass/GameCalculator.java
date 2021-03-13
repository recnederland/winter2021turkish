package javaProgramlamayaGirisRabstractClass;

public abstract class GameCalculator {
	
	////  2 abstract and final ////////
	// final diyerek artik chil'in kullanirken onu ezmesi yani degistirmesi onlenmis olur
	// final tamamlanmis operasyon demekken abstract eksik tamamlanmasi gereken operasyon/methodu ifade eder
	// abstract varsa onun child tarafindan implement edilmesi zorunlu ancak kendine gore override etmeli ve duzenlemeli
	
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti!");
	}	
	
	
	
	/////////  1  //////////
	
//	public void hesapla() {
//		System.out.println("Puaniniz: 90");
//	}
//	public void gameOver() {
//		System.out.println("Oyun bitti!");
//	}

}
