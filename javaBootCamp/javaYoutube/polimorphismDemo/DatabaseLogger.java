package polimorphismDemo;

public class DatabaseLogger extends BaseLogger {

	// Üzerine yazdık.
	@Override
	public void log(String message) {
		System.out.println("Database loglandı : " + message);

	}

}
