package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="service")
public class ServicesPojo {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="serv_id")
	public int service_id;
	
	@Column(name="sal_id")
	public int salon_id;
	
	@Column(name="serv_name")
	public String service_name;
	
	@Column(name="serv_cost")
	public int service_cost;
	
	public ServicesPojo() {
		service_id=0;
		salon_id=0;
		service_name=null;
		service_cost=0;	
	}

	public ServicesPojo(int service_id, int salon_id, int service_cost, String service_name) {
		this.service_id = service_id;
		this.salon_id = salon_id;
		this.service_name = service_name;
		this.service_cost = service_cost;
	}

	
	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public int getSalon_id() {
		return salon_id;
	}

	public void setSalon_id(int salon_id) {
		this.salon_id = salon_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public int getService_cost() {
		return service_cost;
	}

	public void setService_cost(int service_cost) {
		this.service_cost = service_cost;
	}

//	public String toString() {
//		String str="";
//	 str+= "service_id=" + service_id + ", salon_id=" + salon_id + ", service_name=" + service_name
//				+ ", service_cost=" + service_cost + ", getService_id()=" + getService_id() + ", getSalon_id()="
//				+ getSalon_id() + ", getService_name()=" + getService_name() + ", getService_cost()="
//				+ getService_cost();
//	 
//	 return str;
//	}
//	

}
