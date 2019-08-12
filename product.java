// Time Complexity : O(n)
//Space complexity : O(n)
//Leetocode yes
//problems no 
/*
for every element we store the product of number of its left side elements and its rightside elements. We store these 2 products
in 2 different arrays. In the end we multiply corresponding entries from each of these arrays to get the desired result
for every element.
*/



class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] leftProduct = new int[nums.length];
        int[]  rightProduct =new int[nums.length];
        int[] result = new int[nums.length];
        
        for(int i =0;i <nums.length;i++)
        {   
            if(i==0)
             leftProduct[i] = 1;
            else
                leftProduct[i] = nums[i-1]*leftProduct[i-1];
        }
        
          for(int i =nums.length-1;i >=0 ;i--)
        {   
            if(i==nums.length-1)
                rightProduct[i] = 1;
            else
                rightProduct[i] = rightProduct[i+1]*nums[i+1];      
        }
        
        for(int i =0;i<nums.length;i++)
        {
            result[i] = leftProduct[i] * rightProduct[i];
            
        }
        
        return result;
        
    }
}
