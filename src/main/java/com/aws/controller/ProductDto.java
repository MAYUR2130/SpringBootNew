package com.aws.controller;

public class ProductDto {

	private String productName;
	private int id;

	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String productName, int id) {
		super();
		this.productName = productName;
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
