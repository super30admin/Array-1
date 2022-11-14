/*
Time Complexity -->
O(n)

Space Complexity -->
O(1)

Approach -->
Prefix and Postfix approach where numbers 
Get the pre Multiplication number abd post multiplication number from the index and multiple them
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []arr = new int[n];
        int prod = nums[0];
        arr[0] = 1;
        
        // prefix multiplication
        for(int j=1;j<arr.length;j++){
            arr[j] = arr[j-1]*prod;
            prod = nums[j];
        }//for
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }//for
        
        //postfix multiplication
        prod = nums[n-1];
        for(int j=arr.length-2;j>=0;j--){
            arr[j] = prod*arr[j];
            prod*=nums[j];
            //System.out.println(prod);
            
        }
        
        
        
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }//for
        
        return arr;
        
    }
}