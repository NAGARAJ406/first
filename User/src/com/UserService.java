package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.annotations.ApiParam;
import javax.ws.rs.Consumes;




@Path("/UserService")
public class UserService {
   //UserDao userDao = new UserDao();
   @POST
   @Path("/api/customers/references")
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes({"application/json"})
 public String createUserReference (final HttpServletRequest request,@ApiParam(value = "Product identifier", required = false) @RequestParam(required = false) final String productCode)
	{
	   // JSON js = new JSON();
		CustomersReferenceTest crt=new CustomersReferenceTest();
   String s= new String ("welcome");
//		CustomerModel customer= crt.mockCustomer();
	//	if(crt.testIsocode(isocode ) && crt.testStorecode(storeCode))
	if(true)	
   {
		 return "welcome";
		}
		else {
			return "Not ";
		}
		
			
			
	}
}