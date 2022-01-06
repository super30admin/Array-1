//Time Complexity: O(N)
//Space Complexity: O(1)
//To calculate the product of all the elements except the element at i, we calculate the product 
//of all the elements to the left and to the right of the element and then we multiply them together to get our final result

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0]=1;
        int rp = 1;
        
        for(int i=1;i<n;i++){
            rp = rp * nums[i-1];
            result[i]= rp;
        }
        rp = 1;
        
        for(int i = n - 2; i>=0;i--){
            rp = rp * nums[i+1];
            result[i] = result[i]*rp;
            
        }
        return result;
    }
}