package offer_3;

import java.util.HashSet;
import java.util.Set;

/*
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3 

链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
*/
public class Day01 {

	public static void main(String[] args) {
		int number = 0;
		int[] nums = {2, 3, 1, 0, 2, 5, 3};
		Day01 d = new Day01();
		number = d.findRepeatNumber(nums);
		System.out.println(number);

	}
	  public int findRepeatNumber(int[] nums) {
	       
	        for(int i = 1;i<nums.length;i++){
	            for(int n = 0;n<i;n++){
	                if(nums[i]== nums[n]){
	                   return nums[i];
	                }
	            }
	        }
	        return 0;
	    }

}
	    

/*解法一：暴力枚举
万物皆可枚举！一维循环遍历数组中的每一个元素，二维循环判断该元素之前是否存在相等的值！


class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) 
                    return nums[i];
            }
        }
        
        return -1;
    }
}
时间复杂度：O（N^2）
空间复杂度：O（1）

解法二: 排序
对数组排序，若相邻两个元素相等，则返回


class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }
        
        return -1;
    }
}
时间复杂度：O（NlogN）
空间复杂度：O（1）

解法三：哈希表
使用哈希表，采取空间换时间的思想！

用哈希表的set.contains方法，将数组元素加入set，如果元素相同，则无法进行add方法，这时返回该元素。
class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) 
                return nums[i];
            set.add(nums[i]);
        }
        
        return -1;
    }
}
时间复杂度：O（N）
空间复杂度：O（N）

解法四：原地置换
利用数据特性（所有数字都在 0～n-1 的范围内）和数组索引，求出重复地元素


class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
             while (nums[i] != i) {
                 if (nums[i] == nums[nums[i]])
                     return nums[i];
                 int temp = nums[i];
                 nums[i] = nums[temp];
                 nums[temp] = temp;
             }  
        }
        
        return -1;
    }
}
时间复杂度：O（N）
空间复杂度：O（1）

作者：imaginee
链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/javacong-bao-li-mei-ju-dao-yuan-di-zhi-huan-by-ima/
*/
