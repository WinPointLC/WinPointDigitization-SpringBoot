package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
//@Table(name = "product_type")
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productTypeId")
	private int productTypeId;
	@Column(name="productTypeName")
	private String productTypeName;
	@Column(name="description")
	private String description;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "productTypeId", referencedColumnName = "productTypeId")
	private List<Product> products;

	public int getpt_id() {
		return productTypeId;
	}

	public void setId(int productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getTypeName() {
		return productTypeName;
	}

	public void setTypeName(String  productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
