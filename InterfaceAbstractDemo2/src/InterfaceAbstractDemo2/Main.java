package InterfaceAbstractDemo2;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
	
		StarbucksCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Sarpkan ");
		customer.setLastName("Savaþkan ");
		customer.setDateOfBirth(1997);
		customer.setNationalityId(10171862208L );
		
		customerManager.save(customer);
		
		
		
		

	}

}
