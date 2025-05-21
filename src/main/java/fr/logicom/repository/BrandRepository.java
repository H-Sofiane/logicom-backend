package fr.logicom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.logicom.logicom.models.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
