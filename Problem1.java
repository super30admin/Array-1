// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Used the differentiation of left and right arrays. Initialized a left array and a right array. Then took the product of values before the expected value and put it in left array. Similarly added the same for right array. In the end product of left and right array gave the right answer

// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] leftArr=new int[nums.length];
        int[] rightArr=new int[nums.length];
        
        leftArr[0]=1;
        rightArr[nums.length-1]=1;
        
        for(int i=1;i<nums.length;i++){
            leftArr[i]=leftArr[i-1]*nums[i-1];
        }
        
        for(int j=nums.length-2;j>=0;j--){
            rightArr[j]=rightArr[j+1]*nums[j+1];
        }
        
        for(int i=0;i<nums.length;i++){
            leftArr[i]=leftArr[i]*rightArr[i];
        }
        
        return leftArr;
        
    }
}