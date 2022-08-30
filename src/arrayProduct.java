// Time Complexity :o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :Yes

public class arrayProduct{
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
        int runProd = 1;
        arr[0] = 1;
    
        for(int i=1; i< nums.length; i++){
            
            runProd *= nums[i-1];
            arr[i] = runProd;
            
        }
        
        runProd = 1;
        
        for(int i= nums.length-2; i>=0; i--){
            runProd *= nums[i+1];
            arr[i] *= runProd; 
        }
        
        return arr;
        
    }
}