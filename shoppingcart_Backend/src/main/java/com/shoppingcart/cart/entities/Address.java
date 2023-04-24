package com.shoppingcart.cart.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	private String street;
	private String city;
	private String state;
	private long pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Address(long id, String street, String city, String state, long pincode) {
		super();
		this.addressId = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	

	public long getId() {
		return addressId;
	}

	public void setId(long id) {
		this.addressId = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
}
