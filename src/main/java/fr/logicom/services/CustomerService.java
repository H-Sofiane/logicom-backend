package fr.logicom.services;

import java.util.List;

import fr.logicom.dtos.CustomerDTO;

public interface CustomerService {
	
	CustomerDTO saveCustomer(CustomerDTO customerDTO);
	CustomerDTO getCustomer(Long customerId);
	CustomerDTO updatCustomer(CustomerDTO customerDTO);
	List<CustomerDTO>findAllCustomers();
	void deleteCustomer(Long customerId);

}
