package day21_scope;

public class Scope5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			String isim = "Ayse";
			System.out.print(isim);
		}
		// System.out.println(isim);  yukaridaki isim variable'i ayni method icinde olsa da lop icinde
		// olusturuldugundan lop disinda kullanilamazlar
		// bir ornek daha yapalim
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			
		}
		// System.out.println(i);  // i'yi dahi kullanamayiz. Yoksa CTE aliriz
		System.out.println(" ");
		// bu nedenle lop icinde genellikle deger/ variable olusturlamaz
		// int count; // bu sekliyle kullanmayiz bu local variable'dir
		int count = 1;
		while (count < 5) {
			System.out.print(count);
			count++;
		}
	}

}
