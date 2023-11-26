package com.devsuperior.desafio01.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio01.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {

		double shipping;

		if (order.getBasic() < 100.00) {
			shipping = 20.00;
		} else if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00) {
			shipping = 12.00;
		} else {
			shipping = 00.00;
		}
		return shipping;
	}
}