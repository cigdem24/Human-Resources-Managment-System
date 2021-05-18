package javaVideos;

public class VariableArguments {

	// CTRL + SHIFT + / birden fazla satırı yorum satırına alma kısayolu .
//	Variable arguments method içinde birden fazla parametre almaya yarar
//	Arka planda onları bir arrrayda tutar.
//	hesap makinesi örneği ; arka arkaya sayilari toplamak .

	public static void main(String[] args) {
		int x = topla(12, 5, 6, 7, 8);
		System.out.println(x);

	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;
	}

}
