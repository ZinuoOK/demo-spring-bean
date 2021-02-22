package com.leetcode.solution.cn;

/**
 * @author 沐金
 * @version $Id: IsToeplitzMatrix766.java, v0.1 2/22/21 4:03 PM 沐金 $$
 */
public class IsToeplitzMatrix766 {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
		IsToeplitzMatrix766 sol = new IsToeplitzMatrix766();
		boolean result = sol.isToeplitzMatrix(matrix);
		System.out.println(result);
	}

	public boolean isToeplitzMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[0].length - 1; j++) {
				if (matrix[i][j] != matrix[i + 1][j + 1])
					return false;
			}
		}
		return true;
	}
}
