package com;

import java.util.Arrays;
import java.util.List;

public class CustomersReferenceTest {
	
	List<String> isocodes=Arrays.asList("en","fr","de","ca");
	 List <String> storeCodes= Arrays.asList("12125","12435","32415","34212");
	 
//	 
//	 public CustomerModel mockCustomer() {
//		 final CustomerModel customer = mock(CustomerModel.class);
//		 customer.setContactEmail("abc@gmail.com");
//		 customer.setCustomerID("112211");
//		 customer.setTitle("Alpha");
//		 return customer;
//}

	 
	public boolean testIsocode(String isocode )
	{ 
		if(isocodes.contains(isocode))
		{
			return true;
		
		}
		return false;
	}
	
	 
	public boolean testStorecode(String storecode )
	{ 
		if(storeCodes.contains(storecode))
		{
			return true;
		}
		return false;
	}

}
