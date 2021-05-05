package InterfaceAbstractDemo2;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;
	
	public  StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws RemoteException {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Save to db: " +customer.getFirstName());
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}
	
		
	

}
