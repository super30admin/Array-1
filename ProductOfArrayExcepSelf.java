// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//Here I have used left pass and right pass multiplication approach and instead of creating two array I am
//adding result in same array. Space optimization
public class ProductOfArrayExcepSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int rp = 1;
        for(int i = 0 ; i<=nums.length-1 ; i++){
            arr[i] = rp;
            rp = rp * nums[i];
        }
        rp = 1;
        for(int i = nums.length-1 ; i>=0; i--){
            arr[i] = arr[i] * rp ;
            rp = rp * nums[i];
        }
        return arr;
    }
}
