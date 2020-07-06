package offer_3;

import java.util.HashSet;
import java.util.Set;

/*
��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�

ʾ�� 1��

���룺
[2, 3, 1, 0, 2, 5, 3]
�����2 �� 3 

���ӣ�https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
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
	    

/*�ⷨһ������ö��
����Կ�ö�٣�һάѭ�����������е�ÿһ��Ԫ�أ���άѭ���жϸ�Ԫ��֮ǰ�Ƿ������ȵ�ֵ��


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
ʱ�临�Ӷȣ�O��N^2��
�ռ临�Ӷȣ�O��1��

�ⷨ��: ����
��������������������Ԫ����ȣ��򷵻�


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
ʱ�临�Ӷȣ�O��NlogN��
�ռ临�Ӷȣ�O��1��

�ⷨ������ϣ��
ʹ�ù�ϣ����ȡ�ռ任ʱ���˼�룡

�ù�ϣ���set.contains������������Ԫ�ؼ���set�����Ԫ����ͬ�����޷�����add��������ʱ���ظ�Ԫ�ء�
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
ʱ�临�Ӷȣ�O��N��
�ռ临�Ӷȣ�O��N��

�ⷨ�ģ�ԭ���û�
�����������ԣ��������ֶ��� 0��n-1 �ķ�Χ�ڣ�����������������ظ���Ԫ��


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
ʱ�临�Ӷȣ�O��N��
�ռ临�Ӷȣ�O��1��

���ߣ�imaginee
���ӣ�https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/javacong-bao-li-mei-ju-dao-yuan-di-zhi-huan-by-ima/
*/
