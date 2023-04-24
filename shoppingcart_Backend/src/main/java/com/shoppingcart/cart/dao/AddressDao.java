package com.shoppingcart.cart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.cart.entities.Address;

public interface AddressDao extends JpaRepository<Address, Long>{
	public Address findAllById(Long userId);
}
