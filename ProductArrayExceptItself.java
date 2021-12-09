//TC - O(n)
//Space - O(1)
// leetcode passed - Yes
public class ProductArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int [] left = new int[n];

        int rp =1;

        left[0] = 1;
        for(int i =1; i<n;i++) {
            left[i] = left[i-1] * nums[i-1];
        }


        for(int i = n-1; i>=0; i--) {
            left[i] = rp*left[i];
            rp = rp*nums[i];
        }

        return left;
    }
}
