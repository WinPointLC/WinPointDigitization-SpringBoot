package com.example.dto;

public interface OrderResponse {

	int getid();
	String getname();
	String getproduct_name();
	int getprice();
	int getquantity();
	
}
/* 
 * 
 * 
 * "SELECT C.id as id, C.name as name, P.product_name as product_name, P.price as price,
 *  P.qty as quantity FROM Customer C INNER JOIN Products P on c.id = p.id 
 *  
 *  
 *  */
