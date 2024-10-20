package org.jsp.sk.CustomerDataManagement.Service;

import java.util.List;

import org.jsp.sk.CustomerDataManagement.Entity.Customer;
import org.jsp.sk.CustomerDataManagement.Repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;

	public Customer saveCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return dao.saveCustomer(customer);

	}

	public List<Customer> getAllCustomerData() {
		return dao.getAllCustomerData();
	}

	public Customer getDataById(int id) {
		return dao.getCustomerDataById(id);
	}
	
	public Customer deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}

	public List<Customer> getCustomerByName(String name) {
		return dao.getCustomerByName(name);
	}
	
	

	public List<Customer> validateCustomer(String name, String email) {
		return dao.validateCustomer(name, email);
	}
}
