package javaVideos;

import java.util.Scanner;

public class MukemmelSayi {

	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.print("Sayı giriniz: ");
		scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		int total = 1;

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				total += i;
			}
		}

		if (total == sayi) {
			System.out.println("Mükemmel sayidir");
		} else {
			System.out.println("Mükemmel sayi değildir");
		}

	}

}
