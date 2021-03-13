package javaProgramlamayaGirisRabstractClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
	}
	// abstract class'lar override edilmeden kullanilamaz
	// GameCalculator yazdigimiz an IDE bize @Override kismini otomatik verir
	// Abstractlar tek basina bu anlamda kullanilamaz ancak yapisal anlamda diger siniflardan farki yoktur
	
	GameCalculator gameCalculator = new GameCalculator() {
		
		@Override
		public void hesapla() {
			// TODO Auto-generated method stub
			
		}
	// Yukaridaki yerine soyle yazilabilir
	GameCalculator gameCalculator = new WomanGameCalculator();
	};

}
