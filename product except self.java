
// Did this code successfully run on Leetcode :yes
//tc: o(n)
//SC: o(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
         int[] output_arr=new int[n];
        
        output_arr[0]=1;
        
        for(int i=1;i<n;i++){
            
            output_arr[i]=nums[i-1]*output_arr[i-1];
        }
        
        int R=1;
        for(int i=n-1;i>=0;i--){
            
            output_arr[i]=output_arr[i]*R;
            R=R*nums[i];
        }
     return output_arr;   
    }
}