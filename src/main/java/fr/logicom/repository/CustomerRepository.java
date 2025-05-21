package fr.logicom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.logicom.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
