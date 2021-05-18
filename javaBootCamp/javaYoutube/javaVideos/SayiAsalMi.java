package javaVideos;

import java.util.Scanner;

public class SayiAsalMi {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {

		boolean test = false;
		System.out.print("Sayı giriniz: ");
		int sayi = SCANNER.nextInt();

		if (sayi == 1) {
			System.out.println("Asal değil");
			return;
			// bağlı olduğun methodu bitir.
		}

		if (sayi < 1) {
			System.out.println("Geçersiz sayi");
			return;
		}

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				test = true;
				break;
			}
		}

		if (test) {
			System.out.println("Asal değil");
		} else {
			System.out.println("Asal sayı");
		}

	}

}
