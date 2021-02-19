package com.atatech.stream.demo;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 沐金
 * @version $Id: CodeFilterTest.java, v0.1 2/18/21 6:36 PM 沐金 $$
 */
public class CodeFilterTest {
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>(4);
		Order order1 = new Order(1L, 2L, "测试商户1", "上海");
		Order order2 = new Order(11L, 22L, "测试商户2", "北京");
		Order order3 = new Order(111L, 222L, "测试商户3", "南京");
		Order order4 = new Order(1111L, 2222L, "测试商户4", "上海");
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		//筛选价格超过22的订单
		List<Order> orderListPriceOver22
				= orders.stream()
				.filter(price -> price.getPrice() > 22)
				.collect(Collectors.toList());
		System.out.println("---筛选价格超过22的订单---");
		System.out.println(orderListPriceOver22);
		//筛选地址在上海且价格低于222的订单
		List<Order> orderListPriceLow222AndInShangHai
				= orders.stream()
				.filter(price -> price.getPrice() < 222)
				.filter(address -> address.getAddress().equals("上海"))
				.collect(Collectors.toList());
		System.out.println("---筛选地址在上海且价格低于222的订单---");
		System.out.println(orderListPriceLow222AndInShangHai);
	}

}
