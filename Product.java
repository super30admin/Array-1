// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We are calculating the running sum first from left to right
//and then from right to left. When calculating from right to left, we must multiply the running sum with the element 
//present in that matrix as a result of left run. Remember to initialize rp = 1 while calculating right running sum

public class Product {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        
        int result[] = productExceptSelf(nums);

        for(int i = 0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp = 1;
        int result[] = new int[n];
        
        result[0] = 1;
        //left run
        for(int i = 1; i < n;i++)
        {
            rp = rp*nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        //right run
        for(int i = n -2; i>=0; i--)
        {
            rp = rp*nums[i + 1];
            result[i] = result[i]*rp;
        }
        
        return result;
    }        
}
