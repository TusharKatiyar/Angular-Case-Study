package com.shoppingcart.cart.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.cart.dao.OrderDao;
import com.shoppingcart.cart.dao.OrderItemDao;
import com.shoppingcart.cart.entities.Order;
import com.shoppingcart.cart.entities.OrderItem;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private OrderItemDao orderItemDao; 

	@Override
	public List<OrderItem> getOrders(Long userId) {
		
		List<Order> orderList=orderDao.findByUserId(userId);
		List<OrderItem> orderItems=new ArrayList<>();
		for(Order order:orderList) {
			orderItems.add(orderItemDao.findByOrderId(order.getId()));	
		}
		return orderItems;
	}

	@Override
	public Order createOrder(Order order) {
		return orderDao.save(order);
	}

}
