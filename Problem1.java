//Problem: 238. Product of Array Except Self
/** 3 Pointer Approach: 
 * Brute Force 1: - Used 2 loops to iterate over all all elements except currennt element.
 * Brute Force 2: - Iterate and multiply all elements. Iterate again and divide by each number.
 * 
 * Implemented approah:
 * 1. Used 2 iterations
 * 2. In first iteration compute product of all LEFT elemenets qnd save in result array(first elemet will be 1)
 * 3. In second iteratin compute product of RIGHT elements and multiply it already saved left computed values.
 * this will our final array
 */ 
//
//time Complexity :
// O(N)

// Space Complexity :
// O(1) - o/p array does not count as extra space

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] result = new int[nums.length];
        int L =1, R = 1, len = nums.length;
        
        // there are no elements left to inde 0;
        result[0] = 1; 
        
        //Product of all LEFT elements         
        for(int i=1; i<len; i++){
            L = nums[i-1] * L;
            result[i] = L;
        } 

        // R represents product of all right elements
        //Product of all Right * LEFT elements   
        for(int i=len-2; i>=0; i--){
            R = nums[i+1] * R;
            result[i] = result[i] * R;
        }
        
        return result;
    }
}