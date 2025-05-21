package fr.logicom.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import fr.logicom.dtos.CustomerDTO;
import fr.logicom.mappers.LogicomMapperImpl;
import fr.logicom.models.Customer;
import fr.logicom.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class CustomerImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	private LogicomMapperImpl dtoMapper;
	private Logger logger;
	
	@Override
	public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
		logger.info("Saving new customer{} " , customerDTO);
		Customer customer = dtoMapper.fromCustomerDTO(customerDTO);
		Customer saveCustomer = customerRepository.save(customer);
		
		return dtoMapper.fromCustomer(saveCustomer);
		
	}

	@Override
	public CustomerDTO getCustomer(Long customerId) {
		Customer customer = customerRepository.findById(customerId)
				.orElse(null);
		return dtoMapper.fromCustomer(customer);
	}

	@Override
	public CustomerDTO updatCustomer(CustomerDTO customerDTO) {
		logger.info("Update customer{} " , customerDTO);
		Customer customer = dtoMapper.fromCustomerDTO(customerDTO);
		Customer saveCustomer = customerRepository.save(customer);
		return dtoMapper.fromCustomer(saveCustomer);
	}

	@Override
	public List<CustomerDTO> findAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		List<CustomerDTO> customersDTO = customers.stream()
				.map(customer -> dtoMapper.fromCustomer(customer))
				.collect(Collectors.toList());
		return customersDTO;
	}

	@Override
	public void deleteCustomer(Long customerId) {
		customerRepository.deleteById(customerId);
		
	}

}
