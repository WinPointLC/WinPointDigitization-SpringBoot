package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dto.OrderResponse;
import com.example.model.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

	@Query("SELECT C.id as id, C.name as name, P.ProductName as product_name, "
    		+ "P.price as price, P.qty as quantity,F.description as descrip FROM Product P  JOIN Customer C on C.id = P.id JOIN product_type F ON "
    		+ "P.ProdTypeId = F.ProdTypId")
    List<OrderResponse> findByJoinOn ();
}

