// Time Complexity : o(N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums==null ||nums.length==0)
            return new int[0];
        // Approach 1 sc o(n)
       /* int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] result=new int[nums.length];
        
        left[0]=1;
        for(int i=1;i<left.length;i++)
            left[i]=left[i-1]*nums[i-1];
        
        right[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
            right[i]=right[i+1]*nums[i+1];
        
        for(int i=0;i<nums.length;i++)
           result[i]=left[i]*right[i]; 
        
        return result;
        */
        
        //Approach -2 sc o(1)
        
        int[] result=new int[nums.length];
        result[0]=1;
        
        // left
         for(int i=1;i<result.length;i++)
            result[i]=result[i-1]*nums[i-1];
        
        //right
        int right=1;
        result[nums.length-1]=right*result[nums.length-1];
        
        for(int i=nums.length-2;i>=0;i--)
        {
            right=right*nums[i+1];
            result[i]=result[i]*right;
        }
        return result;
    }
}
