package javaVideos;

public class ArrayÖrnek {

	public static void main(String[] args) {
		double[] myList = { 1.2, 3.4, 7.9, 0.45, 0.451 };
		double max = myList[0];
		double min = myList[0];
		double total = 0;

		for (double list : myList) {
			if (max < list) {
				max = list;
			}
			if (min > list) {
				min = list;
			}

			total += list;
		}

		System.out.println("Max sayı : " + max);
		System.out.println("Min sayı : " + min);
		System.out.println("Toplam :" + total);
	}

}
