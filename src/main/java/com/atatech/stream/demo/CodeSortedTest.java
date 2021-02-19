package com.atatech.stream.demo;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 沐金
 * @version $Id: CodeSortedTest.java, v0.1 2/19/21 10:36 AM 沐金 $$
 */
public class CodeSortedTest {
	public static void main(String[] args) {
		List<String> lists = Arrays.asList("AKM4L","3L","SE2L","ML1L");
		//排序
		List<String> sortedList = lists.stream().sorted().collect(Collectors.toList());
		System.out.println("---排序---");
		System.out.println(sortedList);

		List<Order> orders= new ArrayList<>(4);
		Order order1 = new Order(1L,2L,"测试商户1","上海");
		Order order2 = new Order(11L,22L,"测试商户2","北京");
		Order order3 = new Order(111L,22L,"测试商户3","南京");
		Order order4 = new Order(1111L,2222L,"测试商户4","上海");

		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);

		//按照价格降序排序,价格相同的话，按照ID降序
		List<Order> orderListSorted
				= orders.stream()
				.sorted(Comparator.comparingLong(Order::getPrice).reversed())
				.sorted(Comparator.comparingLong(Order::getId).reversed())
				.collect(Collectors.toList());
		System.out.println("---按照价格降序排序,价格相同的话，按照ID降序---");
		System.out.println(orderListSorted);
	}
}
