package day24_arrays;
import java.util.Arrays;
public class Arrays01 {
	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		String isim = "Ali";
		
		System.out.println(sayi1 + ","+ sayi2 + ","+  sayi3 + "," + isim);
// Java'da birden fazla elemani koyabilecegimiz (store) objectler vardir
// Bugun bunlardan ilkini ogrenecegiz
		int arr[] = {10, 20, 30};
// int[] arr seklinde de kullanilabilir
// Yukarida ki ornekte array elemanlari manuel yazildigi icin array'in uzunlugunu yazmadik
// Bu ornekte max eleman sayisi (length) yazdigimiz eleman sayisidir
// Array bir objectir
// Eger direk olarak array'i yazdirmak istersek java referansini yazdirir
		System.out.println(arr);  // [I@15db9742
		System.out.println(Arrays.toString(arr));  // [10, 20, 30]
		// Yeni bir array olusturalim
		String takim[] = new String[3]; // 3 elemanli bir array olusturduk. String default caluese null
		System.out.println(takim); // [Ljava.lang.String;@6d06d69c
		System.out.println(Arrays.toString(takim));  // [null, null, null]
		takim[0] = "Ali";
		System.out.println(Arrays.toString(takim));  // [Ali, null, null]
		takim[2] = "Recep";
		System.out.println(Arrays.toString(takim));  // [Ali, null, Recep]
		// Java run time calisan bir programdir, calisinc array olusturulur. Bu satirda CTE degil RTE aliriz
		takim[1] = "Mehmet";
		System.out.println(Arrays.toString(takim));  // [Ali, Mehmet, Recep]
		// Array update etmek
		takim[2] = "Kazim";
		System.out.println(Arrays.toString(takim));  // [Ali, Mehmet, Kazim]
		// array'in uzunlugunu nasil bilabiliriz?
		System.out.println(takim.length);   //  3
		// Array'in son elemanini Mehmet yapin
		takim[takim.length-1] = "Mehmet";
		System.out.println(Arrays.toString(takim)); // [Ali, Mehmet, Mehmet]
		// Eger array'in eleman sayisi tek ise ortadaki elemani Can yapalim
		if (takim.length %2 ==1) {
			int ortaIndex = (takim.length-1)/2;
			takim[ortaIndex] = "Can";
		}
		System.out.println(Arrays.toString(takim));  // [Ali, Can, Mehmet]		
	}
}
