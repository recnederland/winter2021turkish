package day25_arrays;
import java.util.Arrays;
public class Array03 {
	public static void main(String[] args) {
		// 1- Verilen bir String'i array'e nasil ceviririz?
		// 2- Verilen bir cumlede kac kelimei oldugunu bulunuz
	    // 3- Verilen bir cumlede her kelimenin ilk harfini buyuk yapiniz		
		String str = "Herkes Javayi tanisa severdi";
		// bu string'i split (bolme) (string'in methodu) methodu kullanarak array'e cevirelim
		String arr[]  = str.split(" ");
		System.out.println(Arrays.toString(arr));  // [Herkes, Javayi, tanisa, severdi]
		String arr2[]  = str.split("Java");
		System.out.println(Arrays.toString(arr2)); // [Herkes , yi tanisa severdi] 
		String arr3[]  = str.split("a");
		System.out.println(Arrays.toString(arr3)); // [Herkes J, v, yi t, nis,  severdi]
		String arr4[]  = str.split("");
		System.out.println(Arrays.toString(arr4)); // [H, e, r, k, e, s,  , J, a, v, a, y, i,  , t, a, n, i, s, a,  , s, e, v, e, r, d, i]
	}
}
