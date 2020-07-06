//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

//示例:
//
//现有矩阵 matrix 如下：
//
//[
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
//
//给定 target = 5，返回 true。
//
//给定 target = 20，返回 false。
//
//链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof

package offer_3;

public class Day02 {
public static void main(String[] args) {
	int target = 20;
	int[][] matrix = {
			{1,   4,  7, 11, 15},
			{2,   5,  8, 12, 19},
			{3,   6,  9, 16, 22},
			{10, 13, 14, 17, 24},
			{18, 21, 23, 26, 30}
			};
	Day02 d = new Day02();
	System.out.println(d.findNumberIn2DArray(matrix, target));
}
public boolean findNumberIn2DArray(int[][] matrix, int target) {
	for(int i = 0;i<matrix.length;i++) {
		for(int j = 0;j<matrix[i].length;j++) {
			if(matrix[i][j]==target) {
				return true;
			}
				
		}
	}
return false;
}
}
