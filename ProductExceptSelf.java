// Time Complexity : O(n)
// Space Complexity : 2*O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // using left product array and right product array
        //[1,2,3,4]
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=1;
        right[nums.length-1]= 1;
        for ( int i =1;i<=nums.length-1 ; i++){
            //left ={1,1,2,6}
            left[i]= left[i-1]*nums[i-1];
            
        }
        for (int j=nums.length -2; j>=0;j--){
            right[j]= right[j+1]*nums[j+1];
            //right[j]= {24,12,4,1}
        }
        for (int i =0;i<=nums.length-1;i++){
            nums[i]= left[i]*right[i];
        }
        return nums;
    }
}