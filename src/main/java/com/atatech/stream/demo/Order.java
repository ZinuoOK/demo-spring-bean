package com.atatech.stream.demo;

import lombok.Data;

import java.util.Objects;

/**
 * @author 沐金
 * @version $Id: Order.java, v0.1 2/18/21 6:40 PM 沐金 $$
 */
@Data
public class Order {
	private Long id;
	private Long price;
	private String restaurantName;
	private String address;

	public Order(Long id, Long price, String restaurantName, String address) {
		this.id = id;
		this.price = price;
		this.restaurantName = restaurantName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", price=" + price +
				", restaurantName='" + restaurantName + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Order order = (Order) o;
		return Objects.equals(id, order.id) &&
				Objects.equals(price, order.price) &&
				Objects.equals(restaurantName, order.restaurantName) &&
				Objects.equals(address, order.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, price, restaurantName, address);
	}
}
