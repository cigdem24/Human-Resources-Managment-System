package javaVideos;

public class Loops {

	public static void main(String[] args) {
		// FOR DÖNGÜSÜ
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");

		// WHILE DÖNGÜSÜ
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti.");

		// DO-WHİLE DÖNGÜSÜ
		i = 0;
		do {
			System.out.println("Program mutlaka bir defa do-while döngüsüne girer");
			i++;
		} while (i < 1);
		System.out.println("Do-While döngüsü bitti.");

	}

}
