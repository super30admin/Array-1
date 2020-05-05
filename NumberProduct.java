// Time Complexity : O(n), where n is the number of elements in input array
// Space Complexity : O(n) is the output array is taken into consideration, where n is the number of elements in input array
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int tmp=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=tmp;
            tmp*=nums[i];
        }
        tmp=1;
        for(int i=arr.length-1;i>=0;i--){
            arr[i]*=tmp;
            tmp*=nums[i];
        }
        
        return arr;
    }
}