package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class laptop {
	
	private int laptopId;
	private String brand;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void show() {
		System.out.println("Laptop show() method");
	}
	
}
