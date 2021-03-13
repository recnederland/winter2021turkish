package day25_arrays;
import java.util.Arrays;
public class Arrays01 {
	public static void main(String[] args) {
		// Array (Dizi): Java da birden fazla variable store etmek icin kullanilan objelerden biridir.
		// array olusturulurken 2 seyi declare etmeliyiz:
		//   1- data type: yalnizca bir tip olabilir
		//   2- uzunluk (array'in length) maximum arrya'i ifade eder.
		
		int arr [] = {10, 23, 54};           // length = 3
		String isimler [] = new String[4];   // length = 4 olan bir array olusturur
		
		// Array'de primitive datalar veya non=primitive datalarin referanslari store edilebilirler
		// Mesala isimler array'inin icinde isimleri degil, isimlerin referanslari olur
		
		// Array'in elemanlarina ulasma ve update etme
		System.out.println(isimler[1]);
		isimler[2]="Boss";
		isimler[0]="Elveda";
		// Array'in tum elemanlarini yazdirma
		System.out.println(isimler);                    // bu referansi yazdirir  [Ljava.lang.String;@15db9742
		System.out.println(Arrays.toString(isimler));   // bu ise array'in elemanlarini yazdirir [Elveda, null, Boss, null]					
		
		// Array'in elemanlarini method kullanmadan loop ile yazdiralim
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i] + " ");  //  [Elveda, null, Boss, null
		}
		System.out.println();					 //  Elveda null Boss null 
		System.out.println(arr); 				 //  [I@6d06d69c
        // Array'in elemanlarini nasil siralayabiliriz
        isimler[1]="Oguzhan";
        isimler[3]="Bilal";
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
	}
}
