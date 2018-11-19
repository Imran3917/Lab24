package com.lab24.Lab24.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // this maps us to the table
@Table(name="coffee") //you can use this if your table dosent match your pojo
public class Coffee {
	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private String description;
	private String quantity;
	private int price; 
	
	
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Coffee(Integer id, String name, String description, String quentity, int price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quentity;
		this.price = price;
	}
	
	


	public Coffee(String name, String description, String quantity, int price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quentity) {
		this.quantity = quentity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "coffee [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
//	public coffee(Integer id, String name, String location) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.location = location;
//	}
//	
//	public coffee( String name, String location) {
//		
//		this.name = name;
//		this.location = location;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", location=" + location + "]";
//	}
//	

}
