package fr.logicom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.logicom.logicom.models.Product;


	@Repository
	public interface ProductRepository extends JpaRepository<Product, Long> {

	}

