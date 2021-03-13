package javaProgramlamayaGiris;

public class C1_Main {

	public static void main(String[] args) {
		// Encapsulation : getter ve stter kullanrak okuma ve veri gonderme
		// Her bir class'in kendi ismiyle default bir constructor'u (yapici blog'u) varidr
		
		//C2_Product product = new C2_Product(1, "Laptop", "Asus Laptop", 3000,  2,  "Siyah");  // Constructor calisti...
		
		C2_Product product = new C2_Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);

		
		C3_ProductManager productManager = new C3_ProductManager();
		productManager.Add(product);
		//System.out.println(product.getKod());
	}

}
