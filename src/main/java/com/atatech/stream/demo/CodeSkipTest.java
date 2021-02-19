package com.atatech.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 沐金
 * @version $Id: CodeSkipTest.java, v0.1 2/19/21 11:15 AM 沐金 $$
 */
public class CodeSkipTest {
	public static void main(String[] args) {
		List<Long> lists = Arrays.asList(4L, 3L, 2L, 1L);
		//删除前N个元素
		List<Long> sortedList
				= lists.stream()
				.skip(2)
				.collect(Collectors.toList());
		System.out.println("---删除前N个元素---");
		System.out.println(sortedList);
	}
}
