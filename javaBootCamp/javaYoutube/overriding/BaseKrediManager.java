package overriding;

public class BaseKrediManager {

	// final anahtar kelimesi ile override edilemez bu method
	public final double hesapla(double tutar) {

		return tutar * 1.18;

	}
}
