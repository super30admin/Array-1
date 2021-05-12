// Time Complexity :  O(3N) as three times you traverse through all elements but since constants do not count it is O(N) 
// Space Complexity : O(N) - one intermediate array to save running product upto that index
// Did this code successfully run on Leetcode : Yes

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left_nums= new int[nums.length];
        int[] right_nums= new int[nums.length];
        
        left_nums[0]=1; // since left of initial number will always be empty we assign it as 1 as multiplication by 1 yields same res
        right_nums[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){  // compute multiplication of numbers upto index element to the left excluding index
            
            left_nums[i]=left_nums[i-1]*nums[i-1];
        }
        
        for(int i=nums.length-2;i>=0;i--){ // compute multiplication of numbers from index element to the right excluding index
            
            right_nums[i]=right_nums[i+1]*nums[i+1];
        }
        
        for(int i=0;i<nums.length;i++){      // multiply left and right to give final answer
            right_nums[i]=right_nums[i]*left_nums[i];
        }
        
        return right_nums; // return final answer
    }
}