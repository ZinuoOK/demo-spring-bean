package com.atatech.stream.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author 沐金
 * @version $Id: CodeReduceTest.java, v0.1 2/19/21 11:16 AM 沐金 $$
 */
public class CodeReduceTest {
	public static void main(String[] args) {
		List<String> partSlogan = Arrays.asList("上","饿","了","么");
		String slogan
				= partSlogan.stream()
				.reduce("叫外卖", (first, second) -> (first + second));
		System.out.println("---聚合数据---");
		System.out.println(slogan);
	}
}
