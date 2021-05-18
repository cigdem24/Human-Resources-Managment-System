package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// methodu static yaptığımız zaman ilk kullanıcı nesneyi oluşturuyor.
		// ondan sonra bütün kullanıcılar o nesneyi kullanıyor
		// ve program durdurulana kadar bellekten silinmiyor
		// Manager sınıfları asla static yapılmaz.
		// Yardımcı araçlar - kullan bırak araçlar static yapılabilir
		// bir methodu static yaptığımızda direk class ismiyle çağrılır
		// ana class asla static yapılamaz
		// içindeki methodlar static yapılabilir

		Product product = new Product(1, "Mouse", 15);
		ProductManager productManager = new ProductManager();
		productManager.add(product);

		// Yapıcı bloklar newlwyince çalışıyor.
		// Yani static olarak çağırdığımızda çalışmaz

		DatabaseHelper.crud.delete();
		DatabaseHelper.connection.createConnection();

		// birbirine benzeyen operasyonlarını parçalayın ama single responsibility
		// methoduna aykırı
		// bir class bir işi yapar

	}

}
