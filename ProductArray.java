//Time Complexity: O(n) where n is the number of elements
//Space Complexity: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int [] output_arr = new int[n];
        output_arr[0] = 1;
        for(int i = 1; i < n; i++){
            // output_arr[i] = 1;
            output_arr[i] = nums[i-1] * output_arr[i-1];    
            System.out.println(output_arr[i]);
        }  
        
        int R=1;
        for(int i =n-1; i>=0; i--){
            output_arr[i] = output_arr[i] * R;
            R = R * nums[i];
            System.out.println(R);
        }
        return output_arr;
    } 
}