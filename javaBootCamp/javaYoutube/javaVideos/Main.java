package javaVideos;

import java.util.Scanner;

public class Main {

	private static Scanner girdi;

	public static void main(String[] args) {

		girdi = new Scanner(System.in);

		System.out.print("1.sayı : ");
		int sayi1 = girdi.nextInt();

		System.out.print("2.sayı : ");
		int sayi2 = girdi.nextInt();

		System.out.print("3.sayı : ");
		int sayi3 = girdi.nextInt();

		int max = 0, min = 0, middle = 0;

		if (sayi1 > sayi2 || sayi1 > sayi3) {
			if (sayi1 > sayi3) {
				max = sayi1;
				if (sayi2 > sayi3) {
					middle = sayi2;
					min = sayi3;
				} else {
					middle = sayi3;
					min = sayi2;
				}
			}

			else {
				middle = sayi1;
				max = sayi3;
				min = sayi2;
			}
		} else {

			min = sayi1;
			if (sayi2 > sayi3) {
				max = sayi2;
				middle = sayi3;

			} else {
				max = sayi3;
				middle = sayi2;
			}
		}

		System.out.println(max + " > " + middle + " > " + min);

	}

}