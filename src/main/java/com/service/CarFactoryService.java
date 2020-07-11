package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*<bean id="carFactoryService" class="com.service.CarFactoryService" scope="singleton">
	  <property name="name" value="PockerFactory"/>
	  <property name="address" value="CA100, Fremont , US"/>
	  <property name="car" ref="carta"/>
	   <property name="employee" ref="employee"/>
</bean>  */

@Service("carFactoryService")
public class CarFactoryService {

	private String name="PockerFactory";
	private String address="CA100, Fremont , US";
	
	@Autowired
	@Qualifier("carta") // <property name="car" ref="carta"/>
	private Car car; // car is reference of Car type
	
	@Autowired
	@Qualifier("employee") // <property name="employee" ref="employee"/>
	private Employee employee; // employee is reference of Employee

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CarFactoryService [name=" + name + ", address=" + address + ", car=" + car + ", employee=" + employee
				+ "]";
	}

}
