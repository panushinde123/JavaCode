package ProjectBankSystem;

import java.util.*;


public class bank {
	
	 
	public Map<Integer, Customer> customers;
	    private int customerIdCount;

	    public bank() {
	        customers = new HashMap<>();
	        customerIdCount = 1; 
	    }

	    public void addCustomer(String name, String mobileNumber,String address) {
	        Customer customer = new Customer(name, mobileNumber, customerIdCount,address);
	        customers.put(customerIdCount, customer);
	        System.out.println("Customer added with ID: " + customerIdCount);
	        customerIdCount++;
	    }

	    public Customer getCustomer(int id) {
	        return customers.get(id);
	    }
	   


}