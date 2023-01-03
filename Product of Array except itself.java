// Time Complexity - O(2n) = O(n) 
// Space Complexity - O(1) since no auxillary space has been used, only using output

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] results = new int [n];
        int rp = 1;
        results[0] = 1;
        // left repeating prouduct
        for(int i =1 ; i<= n-1; i++){
            rp = rp * nums[i-1];
            results[i] = rp;
        }
        rp = 1;
        // right repeating product
        for(int j = n-2; j>=0; j--){
            rp = rp * nums[j+1];
            results[j] = results[j] * rp;
        }
        
        return results;
        
    }
}