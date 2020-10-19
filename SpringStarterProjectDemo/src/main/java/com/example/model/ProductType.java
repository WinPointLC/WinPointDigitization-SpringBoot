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
import javax.persistence.Table;

@Entity
@Table(name = "product_type")
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ProdTypId;
	@Column(name="type_name")
	private String type_name;
	@Column(name="description")
	private String description;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ProdTypeId", referencedColumnName = "ProdTypId")
	private List<Product> products;

	public int getpt_id() {
		return ProdTypId;
	}

	public void setId(int pt_id) {
		this.ProdTypId = pt_id;
	}

	public String getTypeName() {
		return type_name;
	}

	public void setTypeName(String  type_name) {
		this.type_name = type_name;
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
