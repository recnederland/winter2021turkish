package day13_stringmanipulation;
public class C6_Substring {
	public static void main(String[] args) {
		// ilk 10 harfini son 10 harfini alma vb durumlarda kullanilir		
		String str = "Her derd Java gibi olsa";		
		// str'in ilk 10 harfini * ile gizleyin, geriye kalanlar normal yazilsin		
		System.out.println(str.substring(10));
		System.out.println(str.substring(str.length()-9));
		System.out.println(str.substring(0, 10));
		System.out.println(str.substring(0, 10).replace("Her derd J", "*"));
		System.out.println(str.substring(0,10).replaceAll("\\D","*")+str.substring(10));
	}
}
