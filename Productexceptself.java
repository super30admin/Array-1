// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {  
        int len= nums.length;
        int temp=1;
        int[] lp= new int[len]; //left product array
        int[] rp= new int[len]; //right product array
        int[] result= new int[len];
        //find left product
        for(int i=0; i<len; i++){
            lp[i]= nums[i] * temp;
            temp= lp[i];
            System.out.println(lp[i]);
        }
        temp=1;
        //find right product
        for(int i=len-1; i>=0;i--){
            rp[i]= nums[i] * temp;
            temp= rp[i];
            System.out.println(rp[i]);
        }
  
        for(int i=0; i<=len-1; i++){
            //for first
            if(i==0){
                result[i]=rp[i+1];
            }
            //for last
           else if(i==len-1){
                result[i]=lp[i-1];
            }
         else result[i]= (rp[i+1] * lp[i-1]);
        }
        return result;
    }
}
