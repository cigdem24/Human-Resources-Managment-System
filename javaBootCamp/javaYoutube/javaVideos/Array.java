package javaVideos;

public class Array {

	public static void main(String[] args) {

		System.out.println("KÖTÜ KOD");
		String ogrenci1 = "Ali";
		String ogrenci2 = "Ahmet";
		String ogrenci3 = "Ayşe";
		String ogrenci4 = "Zeynep";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("ARRAY");
		/*
		 * String[] ogrenciler = new String[] {}; ogrenciler[0] = "ali"; Index 0 out
		 * bounds for lenght 0 hatası verir. Uzunluğunu vermediğin diziye index ile
		 * ekleme yapamazsın.
		 */

		String[] ogrenciler = new String[2];
		ogrenciler[0] = "Ayşe";
		ogrenciler[1] = "Ali";

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
