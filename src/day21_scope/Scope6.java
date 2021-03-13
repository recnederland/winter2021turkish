package day21_scope;
public class Scope6 {
	int num1;
	String name = "Ali";
	public static void main(String args){ 
	  add();
	// product (5); // static olmayan bir method statik main method icerisinden cagirilamaz
	}
	public static void add(){
	// num1 ++; // static olmayan num1, static bir method icinde kullanilamaz
	int num2 = 6;
	// char letter; bu haldeydi hata vermesin diye kapattik
	System.out.println("Do addition ");
	// yukarida ki num2 ve letter'in kullanilmasi char olan bos oldugundan once deger verilmasi gerekir
	System.out.println(num2);
	}
	public void product(int num3){
	name = "Veli";
	// num2++; // num2 ustteki method'da olusturulmus local bir variable'dir 
	System.out.println(num3 * num3); // local variable
	// static methoddan instance variable cagirilamaz ancak static olmayan method'da static variable cagrilabilir ? 
	} 
}
