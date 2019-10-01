package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Gourab Sarkar
 * @creation_date 01 Oct 2019 10:13
 * @modification_date 01 Oct 2019 10:13
 * @version 1.0
 * @description This is the Product class in a Maven - Hibernate project
 *
 */

@Entity
public class Product {
	
	@Id
	@Column(name = "ID")
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public int getId() {
		return productId;
	}
	public void setId(int id) {
		this.productId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
