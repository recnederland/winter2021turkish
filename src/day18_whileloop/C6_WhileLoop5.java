package day18_whileloop;
public class C6_WhileLoop5 {
	public static void main(String[] args) {
		// FLAG = bayrak, istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder
	int sayi = 11;
	String flag= "Asal";
	int bolen = 2;
	while (bolen<sayi) {
		if (sayi%bolen==0) {
			flag = "Asal sayi degil";			
		}
		bolen++;
	}
	System.out.println(flag);
	}
}
