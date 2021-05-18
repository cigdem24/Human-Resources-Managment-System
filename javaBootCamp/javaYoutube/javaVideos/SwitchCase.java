package javaVideos;

public class SwitchCase {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel :  Geçtiniz");
			break;

		case 'B':
			System.out.println("İyi :  Geçtiniz");
			break;

		case 'C':
			System.out.println("Fena Değil :  Geçtiniz");
			break;

		case 'F':
			System.out.println("Maalesef :  Kaldınız");
			break;

		default:
			System.out.println("Lütfen geçerli bir not giriniz");
			break;
		}

	}

}
