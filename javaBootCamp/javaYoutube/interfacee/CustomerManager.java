package interfacee;

public class CustomerManager {

	private ICustomerDal iCustomerDal;

	public CustomerManager(ICustomerDal iCustomerDal) {

		this.iCustomerDal = iCustomerDal;
	}

	public void add() {
		// iş kodları yazılır
		this.iCustomerDal.add();
	}

}
