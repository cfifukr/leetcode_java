//1. Two Sum(Easy)

//Companies
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TaskOne {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args){
        int[] test = new int[] {6, 8,10, 2,3,5, 7,3,2,7,4,2,8,42,52,123,53,221,1,2};
        System.out.println(Arrays.toString(twoSum(test, 222)));
        System.out.println(Arrays.toString(twoSum(test, 10)));
        System.out.println(Arrays.toString(twoSum(test, 60)));
        System.out.println(Arrays.toString(twoSum(test, 999)));

    }

}