package com.service;

import org.springframework.stereotype.Service;

/*<bean id="carta" class="com.service.Car" scope="singleton">
	  <property name="model" value="APU-102"/>
	  <property name="vendor" value="BMW"/>
	  <property name="color" value="white"/>
	  <property name="price" value="9091"/>
</bean>*/

@Service("carta")
public class Car {

	private String model="APU-102";
	private String vendor="BMW";
	private String color="white";
	private int price=9091;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", vendor=" + vendor + ", color=" + color + ", price=" + price + "]";
	}

}
