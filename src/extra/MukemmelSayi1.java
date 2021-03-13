package extra;
import java.util.Scanner;
public class MukemmelSayi1 {
	public static void main(String[] args) {
		// 6 --> 1, 2, 3                28 --> 1, 2, 4, 7, 14
		Scanner scan = new Scanner(System.in);
		System.out.println("Test etmek istediginiz sayiyi giriniz: ");
		int number = scan.nextInt();
		
		// int number = 28;
		int total  = 0;
		
		for(int i=1; i < number ; i++) {
			if (number % i == 0) {
				total = total +i;
			}
		}
		if(total == number) {
			System.out.println("Mukemmel sayidir.");
		}else {
			System.out.println("Mukemmel degildir.");
		}
		scan.close();
	}
}
