//Time: O(n)

//Space = O(2n) -> O(n) for left and right product

class Solution {
    public int[] productExceptSelf2(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        int n =  nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];
        
        left[0] = 1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        
        right[n-1] = 1;
        for(int i = n-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }
        
        //mutliply right and left
        for(int i = 0; i < n; i++){
            answer[i] = left[i] * right[i];
        }
        
        return answer;
    }
    
    //with space O(1)
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        int n =  nums.length;
        int[] answer = new int[n];
        
        //store left array product in answer
        answer[0] = 1;
        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        
        //keep running product of R
        int R = 1;
        for(int i = n - 1; i >= 0; i--){
            answer[i] = answer[i] * R;
            R = nums[i] * R;
        }
        return answer;
    }
}