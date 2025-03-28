package s30.week3;

public class ProductButItself {
    public int[] productButItself(int[] nums) {
        int n = nums.length;
        int[] lp = new int[n];
        int[] rp = new int[n];
        int[] result = new int[n];
        lp[0] = 1;
        rp[n-1] = 1;
        for(int i = 1; i < n; i++) {
            lp[i] = lp[i-1] * nums[i-1];
            rp[n-1-i] = rp[n-i] * nums[n-i];
        }
        for(int i = 0 ; i < n ; i++) {
            result[i] = lp[i] * rp[i];
        }
        return result;
    }
}
