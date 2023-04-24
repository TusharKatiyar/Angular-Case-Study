package com.shoppingcart.cart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.cart.dao.AddressDao;
import com.shoppingcart.cart.dao.UserDao;
import com.shoppingcart.cart.entities.Address;
import com.shoppingcart.cart.entities.User;


@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private UserDao userDao;
	
	@SuppressWarnings("deprecation")
	@Override
	public Address getAddresses(Long userId) {
		User user=userDao.getById(userId);
		return user.getAddress();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Address addAddress(Address address, Long userId) {
		addressDao.save(address);
		User user=userDao.getById(userId);
		user.setAddress(address);
		userDao.save(user);
//		System.out.println(address.getUser());
		return address;
	}

	@Override
	public Address updateAddress(Address address, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAddress(Long addressId, Long userId) {
		// TODO Auto-generated method stub
		return false;
	}
}
