package fr.logicom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.logicom.logicom.models.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Long> {

}
