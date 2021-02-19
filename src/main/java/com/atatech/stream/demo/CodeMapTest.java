package com.atatech.stream.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 沐金
 * @version $Id: CodeMapTest.java, v0.1 2/18/21 7:00 PM 沐金 $$
 */
public class CodeMapTest {
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
		//将商户地址前添加上国家
		List<String> OrderStringAddCountry
				= orders.stream()
				.map(address -> "中国" + address.getAddress())
				.collect(Collectors.toList());
		System.out.println("---将商户地址前添加上国家---");
		System.out.println(OrderStringAddCountry);


	}
}
