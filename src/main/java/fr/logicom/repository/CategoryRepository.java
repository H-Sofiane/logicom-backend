package fr.logicom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.logicom.logicom.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
