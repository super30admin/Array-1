// LeetCode 238. Product of Array Except Self
//Time Complexity: O(n) //O(n+n) n is the no of elements in nums
//Space Complexity : O(1) // As output array doest count 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        
        res[0] = 1;
        
        for(int i=1; i<nums.length ; i++){
            res[i]=nums[i-1]*res[i-1];  
        }
        int temp=1;
        for(int k=nums.length-1; k>=0 ;k--){
            res[k]= temp*res[k];
            temp = temp*nums[k];
        }
        return res;
    }
}