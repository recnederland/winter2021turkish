package day25_arrays;
public class MultiDimensionalArrays02 {
	public static void main(String[] args) {
		// Verilen iki katli bir Array'in tum elemanlarinin toplamini bulalim	
		int arr [] [] = {{1, 2, 3}, {3, 5}, {9, 6, 5, 1} };
		int toplam =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				toplam += arr[i][j];
			}
		}
		System.out.println("Array'de ki tum elemanlarin toplami: "+ toplam); //Array'de ki tum elemanlarin toplami: 35
	}
}
