/* Approach: 
Logic: 
1. We can save the left products in an array for every index
2. And products of right numbers for every index
3. Example: for nums: [2,5,3,6], left product array: [1,2,10,30] and right product array: [90,18,6,1]
4. The multiplication of these 2 arrays is the result we want: [90,36,60,30]
5. We can first calculate the left multiplication array and just modify the left array in place by calculating right product and multiplying them with left array numbers
Time comolexity: 0(N)
Space complexity: O(1) : As we are returing the results array
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] results = new int[nums.length];
       results[0] = 1; //since it has no elements on the left
       //left elements
       for(int i=1; i<=nums.length-1; i++)
       {
         results[i] = results[i-1]*nums[i-1];    
       }
       int rightElement=1; //This is the variable that will right sides products. This will start with value one as right most element has no number on the right
       //right elements
       for(int j=nums.length-2; j>=0; j--)
       {
         rightElement = rightElement*nums[j+1];
         results[j] *=  rightElement; 
       }  
      return results;
    }
}