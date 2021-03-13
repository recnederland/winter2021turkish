package day25_arrays;
import java.util.Arrays;
public class Array02 {
	public static void main(String[] args) {
		// Verilen bir array'de bir elemanin var olup olmadigini nasil kontrol ederiz		
			int arr[] = {10, 25, 3, 16, 75};		
			int sayi = 25;
			boolean flag = false;		
		for (int i : arr) {
			if (i == sayi) {
				flag = true;
			}			
		}
		System.out.println(flag);
		if (flag) {
			System.out.println("Array sorulan elemani iceriyor!");
		} else {
			System.out.println("Array sorulan elemani icermiyor!");
		}
		// Ayni soruyu Array class'indan method kullanarak yapalim
		Arrays.sort(arr);				  					// once siralama yapmaliyiz // 3, 10, 16, 25, 75
		Arrays.binarySearch(arr, sayi);  					// sonuc olarak aranan sayinin index'ini ver'r
		System.out.println(Arrays.binarySearch(arr, sayi)); // 3
		System.out.println(Arrays.binarySearch(arr, 3));    // 0
		System.out.println(Arrays.binarySearch(arr, 16));   // 2
		System.out.println(Arrays.binarySearch(arr, 28));   // -5  java olmayan eleman icin index olarak degil sayi olarak sirasini verir
		
		int arr2[] = {12, 15, 25, 14, 3, 12, 65};
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 14));  // 3
		System.out.println(Arrays.binarySearch(arr2, 20));  // -6
		System.out.println(Arrays.binarySearch(arr2, 12));  // 1
		System.out.println(Arrays.binarySearch(arr2, 2));   // -1
		
		// Array'i nasil string'e cevirebiliriz?
		String arrayString = Arrays.toString(arr2);
		System.out.println(arrayString);                    //  [3, 12, 12, 14, 15, 25, 65]
		System.out.println(arrayString.substring(5));       //  2, 12, 14, 15, 25, 65]
	}
}
