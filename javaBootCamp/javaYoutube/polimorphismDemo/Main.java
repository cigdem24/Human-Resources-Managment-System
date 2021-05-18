package polimorphismDemo;

public class Main {

	public static void main(String[] args) {
		// poliforfizm çok biçimlilik demek.

		BaseLogger[] baseLoggers = new BaseLogger[] { new EmailLogger(), new DatabaseLogger(), new FileLogger(),
				new BaseLogger() };
		for (BaseLogger baseLogger : baseLoggers) {
			baseLogger.log("Log mesajı");
		}

		BaseLogger baseLogger = new BaseLogger();
		baseLogger.log("jhsjfdsfk");

		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
