/* Time Complexity: O(n); 
Space complexity: O(1); if the result array is not taken into account.

1. Using left pass and right pass to find the product of elements excet teh self.
2. In left pass, the running product of each element is calculated with the delay of one which is indicated by placing the first element in the result array by 1.
3. Same is carried out for right pass except that the iteration starts from last element and so at each point we just need to multiply the element in left and right pass to get the desired result.

*/

class Solution{
    public int[] productExceptSelf(int[] nums){
        if(nums == 0 || nums.length == 0){
            return new int[0];
        }

        int[] result = new int[nums.length];
        int rp = 1; int temp = 1;
        for(int i=0; i<nums.length; i++){
            rp = rp*temp;
            result[i] = rp;
            temp = nums[i];
        }

        int rp = 1; int temp = 1;
        for(int i=nums.length-1; i>=0; i--){
            rp = rp*temp;
            result[i] = resumt[i] * rp;
            temp = nums[i];
        }

        return result;
    }
}