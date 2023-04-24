package com.shoppingcart.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.cart.entities.Address;
import com.shoppingcart.cart.services.AddressService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;

	// user address management
	@GetMapping("/{userId}/addresses")
	public Address getAddresses(@PathVariable String userId) {
			return this.addressService.getAddresses(Long.parseLong(userId));
	}

	@PostMapping("/{userId}/addAddress")
	public Address addAddresses(@RequestBody Address address, @PathVariable String userId) {
			return this.addressService.addAddress(address,Long.parseLong(userId));
	}
}
