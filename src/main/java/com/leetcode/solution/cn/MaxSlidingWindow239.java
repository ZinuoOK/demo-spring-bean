package com.leetcode.solution.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author 沐金
 * @version $Id: MaxSlidingWindow239.java, v0.1 2/19/21 4:31 PM 沐金 $$
 */
class MaxSlidingWindow239 {

	public static void main(String[] args) {
//		MyMonoQueue myMonoQueue = new MyMonoQueue();
//		myMonoQueue.addFirst(1);
//		myMonoQueue.addLast(2);
//		myMonoQueue.add(4);
//		for (int i = 10; i > 0; i--) {
//			myMonoQueue.push(i);
//		}
		MaxSlidingWindow239 sol = new MaxSlidingWindow239();
		int[] lists = {1, 3, -1, -3, 5, 3, 6, 7};
		int[] result =  sol.maxSlidingWindow(lists, 3);
		for (Integer res : result) {
			System.out.println(res);
		}

	}

	private int[] maxSlidingWindow(int[] nums, int k) {
		MyMonoQueue windows = new MyMonoQueue();
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i < k - 1) {
				windows.push(nums[i]);
			} else {
				windows.push(nums[i]);
				res.add(windows.front());
				windows.pop(nums[i - k + 1]);
			}
		}
		int[] ans = new int[res.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = res.get(i);
		}
		return ans;
	}
}

/**
 * 实现一个数据结构：单调队列
 */
class MyMonoQueue {
	/**
	 * 使用双端队列deque来实现单调队列
	 */
	private ArrayDeque<Integer> que;

	MyMonoQueue() {
		que = new ArrayDeque<>();
	}

	/**
	 * 每次弹出的时候，比较当前要弹出的数值是否等于队列出口元素的数值，如果相等则弹出。
	 * 同时pop之前判断队列当前是否为空。
	 *
	 * @param value element
	 */
	void pop(int value) {
		if (!que.isEmpty() && value == que.peekFirst()) {
			que.peekFirst();
		}
	}

	/**
	 * 如果push的数值大于入口元素的数值，
	 * 那么就将队列后端的数值弹出，直到push的数值小于等于队列入口元素的数值为止。
	 * 这样就保持了队列里的数值是单调从大到小的了。
	 *
	 * @param value element
	 */
	void push(int value) {
		while (!que.isEmpty() && value > que.peekLast()) {
			que.pollLast();
		}
		que.addLast(value);
	}

	/**
	 * 查询当前队列里的最大值 直接返回队列前端也就是front就可以了。
	 */
	int front() {
		return que.peekFirst();
	}

	/**
	 * 返回队列的长度
	 */
	int length() {
		return que.size();
	}

}
