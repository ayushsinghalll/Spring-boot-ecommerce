package com.ecommerce.dao;

import com.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

//@RepositoryRestResource(collectionResourceRel = "products",path = "products")
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product,Long> {

    //@Query("select p from Product p where p.category.id = ?1")
    Page<Product> findByCategoryId(@RequestParam("id") Long id, org.springframework.data.domain.Pageable pageable1);
    Page<Product> findByNameContaining(@RequestParam("name") String name,org.springframework.data.domain.Pageable pageable1);

}
