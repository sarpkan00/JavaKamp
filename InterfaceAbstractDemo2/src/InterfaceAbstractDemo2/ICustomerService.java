package InterfaceAbstractDemo2;

import java.rmi.RemoteException;

public interface ICustomerService {
	
	void save(Customer customer) throws RemoteException;
		
		

}
