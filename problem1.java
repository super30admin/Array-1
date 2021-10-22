// 238 product of array except self
// sovled on leetcode
// time complexity - O(n)
// Space complexity - O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        
        int [] array_1 = new int [nums.length];
        
        int number=1;
        array_1[0]=1;
        
        // storing values in such a way that, it has product till that number
        for(int i=1;i<nums.length;i++){
            array_1[i]=array_1[i-1]*nums[i-1];
        }
    
        for(int i=nums.length-1;i>=0;i--){
            array_1[i]=array_1[i]*number;
            number=nums[i]*number;
        }
    
        return array_1;
    }
}