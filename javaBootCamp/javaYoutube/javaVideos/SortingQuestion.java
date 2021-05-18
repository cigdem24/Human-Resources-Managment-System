package javaVideos;

import java.util.Scanner;

public class SortingQuestion {

	public static void main(String[] args) {

		int[] dizi = new int[3];
		int gecici;

		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + ". Sayıyı giriniz: ");
			dizi[i] = new Scanner(System.in).nextInt();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {

				if (dizi[i] < dizi[j]) {

					gecici = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = gecici;
				}
			}
		}

		System.out.println("\nBüyükten Küçüğe Sıralama : ");
		for (int diziler : dizi) {
			System.out.print(diziler + " > ");
		}
	}

}
