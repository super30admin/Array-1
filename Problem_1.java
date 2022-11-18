// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//Looping through the array nums and storing product of all elements previous to the index in Answer array 
//Looping one again through nums array starting from the end multiplying the value at index in Answer array with 
//product of values after index in nums array. This gives the product of all elements except that element at index.
//Returning answer array

//Example: nums[] = {1,2,3,4}
//after Loop1: answer[] = {1,1,2,6}
//after Loop2: answer[] = {24,12,8,6}
// Your code here along with comments explaining your approach

//238. Product of Array Except Self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0]=1;
        int pro = 1;
        for(int i=1; i<nums.length; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        for (int j=nums.length-2; j>=0; j--){
            pro = pro*nums[j+1];
            answer[j] = answer[j]*pro;  
        }
        return answer;
    }
}