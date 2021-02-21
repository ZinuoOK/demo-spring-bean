package com.leetcode.solution.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 沐金
 * @version $Id: FindShortestSubArray697.java, v0.1 2/20/21 5:22 PM 沐金 $$
 */
public class FindShortestSubArray697 {
	public static void main(String[] args) {
		FindShortestSubArray697 sol = new FindShortestSubArray697();
		int[] nums = {1, 2, 3, 3, 1, 4, 2};
		int res = sol.findShortestSubArray(nums);
		System.out.println(res);
	}

	public int findShortestSubArray(int[] nums) {
		/**
		 * 数组的度的定义是指数组里任一元素出现频数的
		 * 1.获取数组的度
		 * 2.获取相同度的子数组
		 * 3.获取最短的子数组
		 */
		Map<Integer, int[]> map = new HashMap<Integer, int[]>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i])) {
				map.get(nums[i])[0]++;
				map.get(nums[i])[2] = i;
			} else {
				map.put(nums[i], new int[]{1, i, i});
			}
		}
		int maxNum = 0, minLen = 0;
		for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
			int[] arr = entry.getValue();
			if (maxNum < arr[0]) {
				maxNum = arr[0];
				minLen = arr[2] - arr[1] + 1;
			} else if (maxNum == arr[0]) {
				if (minLen > arr[2] - arr[1] + 1) {
					minLen = arr[2] - arr[1] + 1;
				}
			}
		}
		return minLen;
	}
}
