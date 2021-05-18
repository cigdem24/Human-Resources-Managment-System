package oop;

public class ProductManager {

	// Burada JDBC kodları ile database kaydedeceğiz gerçek projede.
	// Bir metod sadece bir işi yapar. -> Single responsibility
	// ProductManager product ile ilgili işlem yapar.

	public void add(Product product) {
		System.out.println("Ürün sepete eklendi : " + product.getName());
	}

}
