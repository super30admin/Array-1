// Time Complexity :o(n)
// Space Complexity :0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :yes, while doing second part.


// Your code here along with comments explaining your approach:taking a new array of length of same size of nums first from index 1 multiplying each previous value and storing in new array.next changing the new array by multiplying from last.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []a=new int [nums.length];
        int left=1;
        a[0]=1;
        for(int i=1;i<nums.length;i++){
            left=left*nums[i-1];
            a[i]=left;
        }
        int right=1;
        
        for(int j=nums.length-2;j>=0;j--){
            right=right*nums[j+1];
            a[j]=right*a[j];
        }
        
return a;}
}