//TC - O(n)
//SC - O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
     
        int n = nums.length;
        int[] res = new int[n];
        
        res[0] = 1;
        int prefixPro = 1;
        for(int i = 1;i < n; i++){
            prefixPro = prefixPro * nums[i-1];
            res[i] = prefixPro;
        }
        
        prefixPro = 1;
        
        for(int i = n-2;i>=0;i--){
            
            prefixPro = prefixPro * nums[i+1];
            res[i] = prefixPro * res[i];
        }
        return res;
    }
}