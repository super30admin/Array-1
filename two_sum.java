//TC: O(n) iterationg through the given array
//Sc: O(n) used HashMap to store the target- arr[i] values
//Leetcode: successful

//Approach: Iterating through the array and subtracting the values and storing them in map
// since a+b = c , c-b =a as there is one exact soln
// Store the subtracted value as key and the current index as index in the map
//When the map contains that subtracted value, return the corresponding value of the key and the current index

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i]))
                map.put(nums[i],i);
            else
            {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
            }
        }
        return result;
    }
}