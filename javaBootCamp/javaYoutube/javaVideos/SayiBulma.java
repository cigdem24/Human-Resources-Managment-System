package javaVideos;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 78, 63, 54, 1, 3, 5 };
		int aranacak = 7;
		boolean test = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				test = true;
				System.out.println("Sayi bulundu");
			}
		}

		if (!test) {
			System.out.println("Sayi bulunamadı");
		}

	}

}
