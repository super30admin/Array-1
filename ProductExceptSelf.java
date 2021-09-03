package Array1;
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:


import java.util.ArrayList;

// Your code here along with comments explaining your approach
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length==0)
            return nums;
        int n = nums.length;
        int res[] = new int[n];
        res[0] = 1;
        int mul = 1;
        for(int i=1; i<n; i++){
            mul = nums[i-1]*mul;
            res[i] = mul;
        }
        mul = 1;
        for(int i=n-2; i>=0; i--){
            mul *= nums[i+1];
            res[i] *= mul;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(new ArrayList<Integer>() {{ for (int i : new ProductExceptSelf().productExceptSelf(new int[]{4,3,2,1,2})) add(i); }});
    }
}