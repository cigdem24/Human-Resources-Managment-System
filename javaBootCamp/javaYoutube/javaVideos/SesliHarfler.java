package javaVideos;

import java.util.Scanner;

public class SesliHarfler {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {

		// BU ÖRNEĞİ SWİTCH İLE DE YAPABİLİRİZ.

		System.out.print("Bir Harf giriniz: ");
		char harf = SCANNER.next().charAt(0);
		boolean test = false;

		char[] sesliHarfler = { 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü' };

		if (harf < 'a' || harf > 'z') {
			System.out.println("Lütfen bir harf giriniz");
			return;
		}
		for (int i = 0; i < sesliHarfler.length; i++) {
			if (harf == sesliHarfler[i]) {
				test = true;
			}
		}

		if (test) {
			System.out.println("Sesli harftir");
		} else {
			System.out.println("Sesli harf değil");
		}

		// BU ÖRNEĞİ SWİTCH İLE DE YAPABİLİRİZ.

	}

}
