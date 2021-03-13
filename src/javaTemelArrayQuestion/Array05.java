package javaTemelArrayQuestion;

import java.util.ArrayList;
import java.util.List;

public class Array05 {

	public static void main(String[] args) {
		// Iki string List olusturunuz
		// Bu listlerde ki ortak elemanlari bulunuz ve ekrana yazdiriniz
		// Ortak eleman yoksa ekrana "Ortak eleman yok!" yazdiriniz
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		List<String> list2 = new ArrayList<>();
		list2.add("X");
		list2.add("B");
		list2.add("Y");
		list2.add("D");
		
		int count = 0;
		
		for (String w : list1) {
			for (String x : list2) {
				if (w.equals(x)) {
					System.out.print(w + " ");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Ayni eleman yok");
			
		}
		System.out.print("| ");
		System.out.print(count);

	}

}
