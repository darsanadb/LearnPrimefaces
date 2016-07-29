package com.primefacesjsf.pojo;

public class Car {

	private String id;
	private String brand;
	
	private int year;
	
	private String color;
	private int price;
	
	
	private boolean soldState;


	public Car(String id, String brand, int year, String color, int price,
			boolean soldState) {
		super();
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
		this.soldState = soldState;
	}
	
	

}
