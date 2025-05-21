package fr.logicom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.logicom.logicom.models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
