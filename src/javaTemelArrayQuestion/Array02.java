package javaTemelArrayQuestion;

public class Array02 {

	public static void main(String[] args) {
		// Bir arrayda ki en buyuk sayiyi yazdirin
		
		int depo;
        int[] dizi = {77,44,22,4,99,11};
        
        depo = dizi[0];
        
        for (int i = 0; i < dizi.length; i++){
            if (dizi[i] > depo) {
                depo = dizi[i];
            }
        }
        
        System.out.println("Dizideki en büyük deger: " + depo);		
        
//		int [] arr = {125, 132, 95, 116, 110};
//		int max = arr [0];
//		
//		for (int w : arr) {
//			if (w > arr) {
//				max = w;
//			}
//		}
//		System.out.println(max);
	}
}
