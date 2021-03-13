package javaTemelArrayQuestion;
import java.util.ArrayList;
import java.util.List;
public class Array01 {
	public static void main(String[] args) {
		// Bir array listede ki butun elemanlari yan yana bosluk ile yazdirin
		
		List<String> sl = new ArrayList<>();
		sl.add("Domates");
		sl.add("Biber");
		sl.add("Patlican");
		sl.add("Kabak");
		sl.add("Sogan");
		
		System.out.println(sl);        // [Domates, Biber, Patlican, Kabak, Sogan]
		for (String s : sl) {
			System.out.print(s+ " ");  // Domates Biber Patlican Kabak Sogan 
		}
	}
}
