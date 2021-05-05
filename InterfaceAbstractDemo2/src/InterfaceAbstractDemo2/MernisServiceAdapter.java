package InterfaceAbstractDemo2;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
	     return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),
	    		 customer.getLastName().toUpperCase(),customer.getDateOfBirth());
		
		
		
	}

}
