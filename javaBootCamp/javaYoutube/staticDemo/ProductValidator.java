package staticDemo;

//Bir ürünü kaydederken güncellerken ürünün kurallara uygun  olup olmadığını sorgularız.
//Bunun için product validator sınıfı kullanılır
public class ProductValidator {

	static {
		System.out.println("static yapıcı blok çalıştı");
	}

	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}

	public boolean isValid(Product product) {
		if (!product.name.isEmpty() && product.price > 0) {
			return true;

		} else {
			return false;
		}
	}

	public void bisey() {

	}

	public static class baskaBirClass {

		public static void sil() {
			System.out.println("İnner classtır");
		}

	}

}
