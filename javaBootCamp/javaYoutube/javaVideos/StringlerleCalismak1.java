package javaVideos;

public class StringlerleCalismak1 {

	public static void main(String[] args) {
		String mesaj = "  Bugün hava çok güzel.  ";
		System.out.println(mesaj);
		System.out.println("Karakter uzunluğu : " + mesaj.length());
		System.out.println("Mesajın 3. harfi : " + mesaj.charAt(2));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.println("Mesaj b harfi ile başlıyor mu ? : " + mesaj.startsWith("b"));
		// java case-sensitive bir dildir.küçük b harfini B olarak algılamaz
		System.out.println("Mesaj .  ile  bitiyor mu ? : " + mesaj.endsWith("."));

		char[] charArray = new char[19];
		mesaj.getChars(0, 10, charArray, 5);
		System.out.println(charArray);

		System.out.println("Mesaj stringinin içindeki ilk 'a harfi' " + mesaj.indexOf('a') + ". indextedir");
		// Sonraki a harfini değil ilk a harfini verir. a yerine ava yazsanda aynı şey.
		System.out.println("Mesaj stringinin sondan  ilk 'a harfi' " + mesaj.lastIndexOf('a') + ". indextedir");

		// mesaj stringinde boşluk karakterkerinin yerine _ yerleştirir.
		System.out.println(mesaj.replace(' ', '_'));

		System.out.println("3. indexten itibaren yaz :" + mesaj.substring(3));

		System.out.println("2.index ile 4.index arasını yaz: " + mesaj.substring(2, 4));
		// 4.indexi dahil etmez

		// Boşluklara göre kelimeyi tek tek yaz
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);

		}

		System.out.println("Hepsi büyük harf : " + mesaj.toUpperCase());
		System.out.println("Hepsi küçük harf : " + mesaj.toLowerCase());

		System.out.println("başındaki sonundaki boşlukları at : " + mesaj.trim());
	}

}
