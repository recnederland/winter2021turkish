package day23_statickeyword;

public class StaticBlock {
	
	// static blog class calistirildiginda ilk olarak calisir, main method'dan da once calisir
	static String isim;
	
	// static block olusturalim
	static {
		isim = "Mehmey";
		System.out.println(isim);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isim ="Alican";
		System.out.println(isim);
	}

}
