// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach

// Brute force gave time limit exceeeded 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int start = 0;
        int end = nums.length;
        int [] output = new int[nums.length];
        Arrays.fill(output,1);
        for(int i=0;i<nums.length;i++)
        {
            if(i==0) start=1;
            else start=0;
            if(i==nums.length-1) end=nums.length-1;
            
            for(int j=start;j<end;j++)
            {
                if(j==i)
                {
                    continue;
                }else
                {
                    output[i]*=nums[j];
                }
            }
             
        }
        
        return output;
    }
}

// Left and right product approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] left = new int [nums.length];
        int [] right = new int [nums.length];
        int [] output = new int [nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1;i<left.length;i++)    //  1 2 3 4  left - 1 1 2 6
        {
            left[i]=left[i-1]*nums[i-1];
        }
        
        for(int j=nums.length-2;j>=0;j--)  // 1 2 3 4 right - 24 12 4 1
        {
            right[j] = right[j+1]*nums[j+1];
        }
        
        // 1 1 2 6 
        // 24 12 4 1
        // 24 12 8 6 
        
        for(int i=0 ; i<output.length;i++)      
        {
            output[i] = left[i]* right[i];    
        }
        
        return output;
    }
    
}

