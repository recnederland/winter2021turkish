package day25_arrays;
import java.util.Arrays;
public class MultiDimensionalArrays01 {
	public static void main(String[] args) {
		/*
		 * 1- Ic Icice array olusturdugumuzda disardaki ana array'e outer array
		 *    icerdeki kucuk array'lere ise inner array denir
		 * 2- Eger icerdeki array'lerin boyutlari birbirinden farkli ise 
		 *    Array'i ancak tum elemenlari yazarak declare edebiliriz
		 * 3- Multi dimensional array'de bir elemanin indexi icin 
		 *    en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir   */	
		int arr [] [] = {{1, 3, 5}, {3,5}, {5, 9, 11, 3}}; // iki katli bir array'dir
		// 11'i index olarak ifade etmek istersek [2] [2]
		// eger Array'i uzunlukla declare etmek istersek inne array uzunluklari esit olmali
		int arr2 [] [] = new int [3] [2];
		// [3] ilk yazilan sayi outer array'in icinde kac tane inner array oldugunu belirtir
		// [2] her bir inner array'in uzunlugu	
		System.out.println(Arrays.toString(arr));  // [[I@15db9742, [I@6d06d69c, [I@7852e922]
		System.out.println(Arrays.toString(arr2)); // [[I@15db9742, [I@6d06d69c, [I@7852e922]
		// Multidimensional array'leri yazdirmak icin toString methodu kullanilamaz
		// CunkutoString methodu array'i string'e cevirir
		// Outer array'in icinde inner array'ler oldugundan toString method'unda inner array'lerin referans degerleri yazdirilir		
		System.out.println(arr2); // [[I@4e25154f
		System.out.println(Arrays.deepToString(arr2));  // [[0, 0], [0, 0], [0, 0]]		
	}
}
