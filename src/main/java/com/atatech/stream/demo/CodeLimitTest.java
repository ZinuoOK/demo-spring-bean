package com.atatech.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 沐金
 * @version $Id: CodeLimitTest.java, v0.1 2/19/21 11:10 AM 沐金 $$
 */
public class CodeLimitTest {
	public static void main(String[] args) {
		List<Long> lists = Arrays.asList(4L, 3L, 2L, 1L);
		//限制返回个数
		List<Long> sortedList
				= lists.stream()
				.limit(2)
				.collect(Collectors.toList());
		System.out.println("---限制返回个数---");
		System.out.println(sortedList);
	}
}
