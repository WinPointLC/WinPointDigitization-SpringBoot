package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dto.OrderResponse;
import com.example.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("FROM Customer WHERE name = ?1")
    List<Customer> findByFirstName(String firstName);
 
    @Query("FROM Author a WHERE name = ?1 AND email = ?2")
    List<Customer> findByFirstNameAndEmail(String firstName, String email);
    
    @Query("SELECT C.id as id, C.name as name, P.ProductName as product_name, "
    		+ "P.price as price, P.qty as quantity FROM Product P  JOIN Customer C on C.id = P.id ")
    List<OrderResponse> findByJoin ();
}
