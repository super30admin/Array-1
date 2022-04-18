// Time Complexity : O(n) n lis len of arr
// Space Complexity : O(n) using aux array with length n
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : we right product till and from right to get to products

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] arr){
        int len = arr.length;

        int[] ans = new int[len];
        // ans array will contain product of ele. ith element is product till i-1
        // nothing on left of first elem, so ans[0] = 1
        ans[0] = 1;
        for(int i=1; i < len; i++){
            ans[i] = arr[i-1] * ans[i-1];
        }
        int R = 1;
        for(int i = len-1; i >= 0; i--){
            ans[i] = ans[i] * R;
            R *= arr[i];
        }
        return ans;
    }
}
