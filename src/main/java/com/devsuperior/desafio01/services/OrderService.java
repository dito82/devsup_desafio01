package com.devsuperior.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio01.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {
		return order.getBasic() + shippingService.shipment(order) - order.getDiscount();
	}

}
