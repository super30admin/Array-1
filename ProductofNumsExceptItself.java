//Using Running Product just like Running Sum;
//TC: O(N); with 2 pass of the array;
//SC: O(1); Not using any intermediary array to store the result as such;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //Hey, help me find the product of the numbers from the given array where the result will return the product of numbers other than the number itself;
        
       int[] numsResult=new int[nums.length];
        int rp=1;
        numsResult[0]=1;
        for(int i=1;i<nums.length;i++){
            rp=rp*nums[i-1];
            numsResult[i]=rp;
        }
        
        rp=1;
        for(int i=nums.length-2;i>=0;i--){
            rp=rp*nums[i+1];
            numsResult[i]=rp*numsResult[i];
            //this is where thecatch is that hey,
            // whenever puttting this product multiply with what the prouct of the previuos numbers being computed
        }
        
        return numsResult;
        
        //time complexity is O(1) as arrray which is being modified is being returned as well; and is not used as intermediary;
        
    }
}
