//Approach-1: Using the two loops
//Approach-2: Take product and divide by numbers
//Approach-3(Current Approach): Contineous product using left and right arrays.
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(N)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0 || nums == null) return new int[0];
        int n = nums.length;
        
        int[] l = new int[n];
        int[] r = new int[n];
        
        //Travelling from left
        l[0] = 1;
        
        for(int i = 1; i < n; i++){
            l[i] = l[i-1] * nums[i-1];
        }
        
        //Travelling from right
        r[n-1] = 1;
        
        for(int i = n - 2; i >=0 ; i--){
            r[i] = r[i + 1] * nums[i + 1];
        }
        
        int[] res = new int[n];
        
        for(int i = 0; i < n; i++){
            res[i] = l[i] * r[i];
        }        
        
        return res;
    }
}


//Approach-4: Using the left array and the right approach (Using constant space)
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        
        int[] l = new int[n];
        l[0] = 1;
        
        for(int i = 1; i < n; i++){
            l[i] = l[i - 1] * nums[i -1]; //We shouldn't be including the number itself
        }
        
        //Declaring a variable that holds the running product
        int r = 1;
        for(int i = n-1; i >= 0 ; i--){
            l[i] = l[i] * r;
            r = r * nums[i];
        }
        
        return l;
    }
}