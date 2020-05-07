package s30Coding;

//Time Complexity :- O(n) - traverse through all elements of the array

// Space Complexity :- O(1)

//LeetCode SuccessFull :- Yes

public class ProductExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        int[] result = new int[nums.length];
        int rp  = 1; int temp = 1;
        for(int i = 0; i < nums.length; i++){
            rp = rp* temp;
            temp = nums[i];
            result[i] = rp;
        }
        
        rp = 1 ; temp = 1;
        for(int i = nums.length -1 ; i >=0; i--){
             rp = rp* temp;
            temp = nums[i];
            result[i] = result[i] * rp;
        }
        
        
        return result;
    }
}
