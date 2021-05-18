package javaVideos;

public class ArrayCokBoyutlu {
	public static void main(String[] args) {

		String[][] sehirler = new String[3][4];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Edirne";
		sehirler[0][2] = "Bursa";
		sehirler[0][3] = "Kocaeli";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Çankırı";
		sehirler[1][3] = "Çorum";
		sehirler[2][0] = "Trabzon";
		sehirler[2][1] = "Rize";
		sehirler[2][2] = "Artvin";
		sehirler[2][3] = "Samsun";

		for (int i = 0; i < sehirler.length; i++) {
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(i + 1 + ".Bölge " + (j + 1) + ".Şehir : " + sehirler[i][j]);
			}
			System.out.println("************");
		}

	}

}
