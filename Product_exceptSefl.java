//TimeComplexity O(n)
//SpaceComplexity O(1) Space taken for left[] returning it as output so constant
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0)return null;
        int[] left = new int[nums.length];
        left[0] = 1;
        
        for(int i = 1 ; i < nums.length ; i++){
            left[i] = nums[i-1]*left[i-1];
            
        }
        int rp = 1;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            left[i] *= rp;
            rp *= nums[i];          
        }       
        return left;
    }
}
