package oop;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(15, "Laptop", "16gb Ram", 10000.500, 15000);

		System.out.println(product.getProductCode());

		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
