package javaVideos;

public class ArkadasSayilar {

	public static void main(String[] args) {

		int sayi = 220;
		int sayi1 = 284;
		int total = 0;
		int total1 = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				total += i;
			}
		}
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				total1 += i;
			}
		}

		// AND operatörü ->> && her iki şartıda sağlamalı
		// VE operatörü ->> || bir koşulu sağlasa yeterli
		if (sayi == total1 && sayi1 == total) {
			System.out.println("Bu iki sayı arkadaş sayılardır.");
		} else {
			System.out.println("Değildir.");
		}

	}

}
