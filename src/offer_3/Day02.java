//��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������

//ʾ��:
//
//���о��� matrix ���£�
//
//[
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
//
//���� target = 5������ true��
//
//���� target = 20������ false��
//
//���ӣ�https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof

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
