package org.jk.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductStock {
	@Id
	private Long id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_price")
	private BigDecimal productPrice;
	
	@Column(name = "product_availability")
	private String productAvailability;
	
	@Column(name = "discount_offer")
	private double discountOffer;
	
	

	public ProductStock() {
		
	}
	
	public ProductStock(Long id, String productName, BigDecimal productPrice, String productAvailability,
			double discountOffer) {
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productAvailability = productAvailability;
		this.discountOffer = discountOffer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(String productAvailability) {
		this.productAvailability = productAvailability;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
}
