package interfacee;

import interfacee.CustomerManager;

public class Main {

	public static void main(String[] args) {
		// interfacesler tamamlanmamış methodlar içerir.
		// interfaceler class değil sadece referans tutucu görevi görüyor.
		// interfaceler newlenemez.
		// imza taşırlar
		// bir class birden fazla interfacesi implemente edebilir.
		// bir class sadece bir sınıfı inherite edebilir.

		ICustomerDal customerDal = new OracleCustomerDal();
		// IcustomerDal onu implemente eden sınıfıfn referansını tutabilir.

		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

		customerManager.add();
	}

}
