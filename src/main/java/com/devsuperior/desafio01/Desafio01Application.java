package com.devsuperior.desafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Date Order");
		System.out.print("Code: ");
		int code = sc.nextInt();
		System.out.print("Basic: ");
		double basic = sc.nextDouble();
		System.out.print("Discount: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		// System.out.println("Code: " + order.getCode());
		// System.out.println("Total value: " + orderService.total(order));
		System.out.println("Code: " + code);
		System.out.println("Total value: " + orderService.total(order));

		sc.close();
	}

}
