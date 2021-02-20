package com.leetcode.solution.cn;

/**
 * @author 沐金
 * @version $Id: LongestOnes1004.java, v0.1 2/19/21 2:28 PM 沐金 $$
 */
public class LongestOnes1004 {
	private int longestOnes(int[] A, int K) {
		int N = A.length;
		int res = 0;
		int right = 0, left = 0;
		int zeros = 0;
		while (right < N) {
			if (A[right] == 0) {
				zeros++;
			}
			while (zeros > K) {
				if (A[left++] == 0) {
					zeros--;
				}
			}
			res = Math.max(res, right - left + 1);
			right++;
		}
		return res;
	}

	public static void main(String[] args) {
		LongestOnes1004 sol = new LongestOnes1004();
		int[] lists = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		int result = sol.longestOnes(lists, 2);
		System.out.println(result);
	}
}
