package com.simplilearn.sporty.Entity;

import java.util.Date;

import javax.persistence.*;



@Entity
public class PurchaseReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String categoryOfProduct;
	
	private String productName;

	private int priceOfTheProduct;

	private String userWhoBoughtTheProduct;
	
	private String userEmailBoughtTheProduct;

	@Temporal(TemporalType.DATE)
	private Date dateOfProductPurchase;

	public PurchaseReport(String productName, String categoryOfProduct, int priceOfTheProduct, String userWhoBoughtTheProduct, String userEmailBoughtTheProduct, Date dateOfProductPurchase) {
		this.productName = productName;
		this.categoryOfProduct = categoryOfProduct;
		this.userWhoBoughtTheProduct = userWhoBoughtTheProduct;
		this.dateOfProductPurchase = dateOfProductPurchase;
		this.userEmailBoughtTheProduct = userEmailBoughtTheProduct;
		this.priceOfTheProduct = priceOfTheProduct;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryOfProduct() {
		return categoryOfProduct;
	}

	public void setCategoryOfProduct(String categoryOfProduct) {
		this.categoryOfProduct = categoryOfProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPriceOfTheProduct() {
		return priceOfTheProduct;
	}

	public void setPriceOfTheProduct(int priceOfTheProduct) {
		this.priceOfTheProduct = priceOfTheProduct;
	}

	public String getUserWhoBoughtTheProduct() {
		return userWhoBoughtTheProduct;
	}

	public void setUserWhoBoughtTheProduct(String userWhoBoughtTheProduct) {
		this.userWhoBoughtTheProduct = userWhoBoughtTheProduct;
	}

	public String getUserEmailBoughtTheProduct() {
		return userEmailBoughtTheProduct;
	}

	public void setUserEmailBoughtTheProduct(String userEmailBoughtTheProduct) {
		this.userEmailBoughtTheProduct = userEmailBoughtTheProduct;
	}

	public Date getDateOfProductPurchase() {
		return dateOfProductPurchase;
	}

	public void setDateOfProductPurchase(Date dateOfProductPurchase) {
		this.dateOfProductPurchase = dateOfProductPurchase;
	}

	public PurchaseReport(int id, String categoryOfProduct, String productName, int priceOfTheProduct,
			String userWhoBoughtTheProduct, String userEmailBoughtTheProduct, Date dateOfProductPurchase) {
		super();
		this.id = id;
		this.categoryOfProduct = categoryOfProduct;
		this.productName = productName;
		this.priceOfTheProduct = priceOfTheProduct;
		this.userWhoBoughtTheProduct = userWhoBoughtTheProduct;
		this.userEmailBoughtTheProduct = userEmailBoughtTheProduct;
		this.dateOfProductPurchase = dateOfProductPurchase;
	}

	public PurchaseReport() {
		super();
	}

	@Override
	public String toString() {
		return "PurchaseReport [id=" + id + ", categoryOfProduct=" + categoryOfProduct + ", productName=" + productName
				+ ", priceOfTheProduct=" + priceOfTheProduct + ", userWhoBoughtTheProduct=" + userWhoBoughtTheProduct
				+ ", userEmailBoughtTheProduct=" + userEmailBoughtTheProduct + ", dateOfProductPurchase="
				+ dateOfProductPurchase + "]";
	}
	
	

}
