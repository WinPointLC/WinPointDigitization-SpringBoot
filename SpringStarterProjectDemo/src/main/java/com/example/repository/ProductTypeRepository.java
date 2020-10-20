package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dto.OrderResponeMod;
import com.example.dto.OrderResponse;
import com.example.model.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

//	@Query("SELECT C.id as id, C.name as name, P.ProductName as product_name, "
//    		+ "P.price as price, P.qty as quantity, PT.description as descrip FROM "
//    		+ "Product P  JOIN Customer C on C.id = P.id JOIN product_type PT ON "
//    		+ "P.ProdTypeId = PT.ProdTypId")
//    List<OrderResponeMod> findByJoinOn ();
	
	@Query("SELECT C.id as id, C.name as name, P.ProductName as ProductName, "
			+ "    		P.price as price, P.qty as quantity, PT.description as descrip FROM "
			+ "    		Product P JOIN Customer C on C.id = P.idLet JOIN ProductType PT ON "
			+ "    		P.productTypeId = PT.productTypeId")
    List<OrderResponeMod> findByJoinOn ();

}

