package com.simplilearn.sporty.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;



import javax.persistence.*;



@Entity
@Table(name = "product")
//Added below line to not get Infinite loop when retriving user and product details
//@JsonIgnoreType({ "hibernateLazyInitializer", "handler", "users" })
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	private String productName;

	private int productPrice;

	private String category;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "products")
	private List<User> users = new ArrayList<User>();

	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public String toString() {

		return "Custom ToString -> Product";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Product(int productId, String productName, int productPrice, String category, List<User> users) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
		this.users = users;
	}

	public Product() {
		super();
	}

	public Product(String productName, int productPrice, String category, List<User> users) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
		this.users = users;
	}
	
}
