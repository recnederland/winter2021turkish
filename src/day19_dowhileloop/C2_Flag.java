package day19_dowhileloop;
import java.util.Scanner;
public class C2_Flag {
	public static void main(String[] args) {
		 // Kullanicidan bir cumle ve bir harf isteyin
        // while loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
        // program Case Sensitive olsun  
		// Count tek tek sayiyorken
		// Flag anahtar gibi var yok seklinde calisir.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        String flag = "yok";
        int index = 0;
        while (index < cumle.length()) {
			if (cumle.charAt(index) >= 'A' && cumle.charAt(index) <= 'Z') {
				flag = "var";
			}
			index++;
		}
        System.out.println("Verdiginiz cumlede buyuk harf " + flag + "var");
        scan.close();
	}
}
