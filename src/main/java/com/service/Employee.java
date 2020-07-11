package com.service;

import org.springframework.stereotype.Service;

/*
<bean id="employee" class="com.service.Employee" scope="singleton">
	  <property name="eid" value="E40171780"/>
	  <property name="name" value="Mr. Jhon!"/>
</bean>    */

@Service("employee")
public class Employee {

	private String eid="E40171780";
	private String name="Mr. Jhon!";

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

}
