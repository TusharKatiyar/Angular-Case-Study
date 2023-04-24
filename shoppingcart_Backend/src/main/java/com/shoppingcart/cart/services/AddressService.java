package com.shoppingcart.cart.services;

import com.shoppingcart.cart.entities.Address;


public interface AddressService {
	public Address getAddresses(Long userId);
	public Address addAddress(Address address, Long userId);
	public Address  updateAddress(Address address, Long userId);
	public boolean removeAddress(Long addressId, Long userId);
}
