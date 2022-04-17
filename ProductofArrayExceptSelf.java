// Time Complexity : O(N)
// Space Complexity : O(1), No extra data structure used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Maintain a running product of all the elements to the left of current elemenet, and another running product
//of all elements to its right. Multiply them both to get result.

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums==null) return new int[]{};

        int[] result= new int[nums.length];
        int runProd=1;
        result[0]=1;

        //Calculate value, and store it.
        for(int i=1;i<nums.length;i++){
            runProd*=nums[i-1];
            result[i]=runProd;
        }

        runProd=1;
        for(int i=nums.length-2;i>=0;i--){
            runProd*=nums[i+1];
            result[i]*=runProd;
        }

        return result;
    }
}
