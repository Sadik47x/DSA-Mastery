/*
Problem: Two Sum
Platform: LeetCode
Difficulty: Easy
Topic: Arrays
Pattern: Hashing

Time: O(n)
Space: O(n)

Link:
https://leetcode.com/problems/two-sum/
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i],i);
        }

        return new int[]{};
    }
}
