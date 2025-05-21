package fr.logicom.mappers;

import org.springframework.stereotype.Service;

import fr.logicom.dtos.CustomerDTO;
import fr.logicom.models.Customer;
import org.springframework.beans.BeanUtils;

@Service
public class LogicomMapperImpl {
	public CustomerDTO fromCustomer(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		BeanUtils.copyProperties(customer, customerDTO);
		return customerDTO;
	}
	
	public Customer fromCustomerDTO(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        return customer;
    }

}
