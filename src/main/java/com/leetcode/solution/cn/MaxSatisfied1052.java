package com.leetcode.solution.cn;

import java.util.Arrays;

/**
 * @author 沐金
 * @version $Id: MaxSatisfied1052.java, v0.1 2/23/21 10:00 AM 沐金 $$
 */
public class MaxSatisfied1052 {
	public static void main(String[] args) {
		int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
		int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
		int x = 3;
		int[] updateGrumpy = {};
		updateGrumpy = Arrays.copyOf(grumpy, grumpy.length);
		for (int num : updateGrumpy) {
			System.out.println(num);
		}
	}

	// TODO: 3/2/21 功能未实现
	public int maxSatisfied(int[] customers, int[] grumpy, int X) {
		int res = 0;
		int noUngryCustomers = 0;
		int left = 0;
		int customerNum = customers.length;
		// x 大于等于营业时长的话，满意人数即为所有人
		if (X >= customerNum) {
			for (int customer : customers) {
				res += customer;
			}
		} else {
			// x 小于营业时长，1.不生气的顾客数量 2.滑动窗口之后生气顾客的最大值
			for (int i = 0; i < customerNum; i++) {
				if (grumpy[i] == 0) {
					noUngryCustomers += customers[i];
				}
			}
			for (left = 0; left < customerNum - X; left++) {
				int right = left;
				for (int i = left; i < X; i++) {

				}
			}
		}
		return res;
	}
}
