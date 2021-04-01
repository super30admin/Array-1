/*
Time Complexity : O(n)
Space Complexity : O(1)
*/
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length==0 || nums == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        //iterate through the array 
        for(int i=0;i<nums.length;i++){
            //findex the index of the present element
            int index = Math.abs(nums[i]) - 1;
            //change its state into a negative element to identify the missing element
            if(nums[index]>0){
                nums[index] *= -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            //is the element is positive it is the missing element
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;