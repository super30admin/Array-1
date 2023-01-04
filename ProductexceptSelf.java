// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//In this approach we first maintain the product of all the elements on the left except the self
//Then we add them to the reuslt array. We calculate the product of elements on the right except self.
//And we multiply both the products.

public class ProductexceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)return new int[0];

        int n = nums.length;
        int [] answer = new int[n];
        answer[0] = 1;
        int product = 1;

        //left 
        for(int i=1;i<n;i++){
            product *= nums[i-1];
            answer[i] = product;
        }

        product = 1;
        //right
        for(int i=n-2;i>=0;i--){
            product *= nums[i+1];
            answer[i] *= product;
        }

        return answer;
    }
}
