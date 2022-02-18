/**
TC - O(n) + O(m) = O(n) where n and m both are the length of an input array. Traversing array twice to calculate prefix & suffix products.
SC - O(1)

nums = 
[1,2,3,4] O(n^2)
24,12

24/2 * 1 = 12 O(n)

( prevTotal/nums[i] ) * 1;


24,12,8,6

O(n^2)
O(1)

 [1, 2, 3, 4]
 
 [24, 12, 8, 6]
 
 24  12 4  1
  1  1  2  6
  ----------
  24 12 8  6
  
  
**/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int length = nums.length;
        int result[] = new int[length];
        result[0] = 1;
        
        // Calculate prefix array fr each index.
        for (int i=1; i<nums.length; i++)
        {
            result[i] = result[i-1] * nums[i-1];
        }
        
        int suffix = 1;
        
        for (int j=result.length - 2; j>=0; j--)
        {
            suffix = suffix * nums[j+1];
            result[j] *= suffix; 
        }
      
        return result;
    }
}