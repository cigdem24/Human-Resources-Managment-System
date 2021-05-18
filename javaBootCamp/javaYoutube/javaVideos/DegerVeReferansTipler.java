package javaVideos;

public class DegerVeReferansTipler {

	public static void main(String[] args) {
		// DEĞER VE REFERANS TİPLER instance
		// Primitive Tipler -> DEĞER TİPLER STACKTE TUTULUR. -> int double float boolean
		// byte
		int number1 = 20, number2 = 30;
		number1 = number2;
		System.out.println(number1);

		// İSTİSNADIR. String referans tiptir. ama değer tip gibi çalışır.
		String letter = "ABC";
		String letter1 = "XYZ";
		letter = letter1;
		letter1 = "123";
		System.out.println(letter);

		// REFERANS TİPLER HEAP TE TUTULUR. -> array , classlar , interface , abstract
		String[] kelimeler = { "Elma", "Armut", "Kivi" };
		String[] sayilar = { "1", "11", "111" };
		kelimeler = sayilar;
		sayilar[0] = "2";
		System.out.println(kelimeler[0]);
		System.out.println(kelimeler[2]);

	}

}
