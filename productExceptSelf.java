// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/**
 * 1. Create two arrays leftProduct and rightProduct with running products except self.
 * 2. Multiply leftProduct and rightProduct to get the final result.
 */

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftProduct = new int[len], rightProduct = new int[len], finalResult = new int[len];

        int i=0, j=len-1;

        while(i<len && j>=0){
            if(i==0 && j==len-1){
                leftProduct[i] = 1;
                rightProduct[j] = 1;
                i++;
                j--;
                continue;
            }

            leftProduct[i] = leftProduct[i-1] * nums[i-1];
            rightProduct[j] = rightProduct[j+1] * nums[j+1];
            i++;
            j--;
        }

        for(int k=0; k<len; k++){
            finalResult[k] = leftProduct[k] * rightProduct[k];
        }

        return finalResult;
    }
}