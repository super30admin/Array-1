//Time complexity: O(n) 
//Space Complexity: O(1) | We are using only the result array
//Program ran successfully
/*  Algorithm: 1. Based on observation that the product at any index except itself would be product of all elements to the left of that element and product of all elements to the right of that element
               2. First calculate the running product in the left to right direction. This is to determine the product of elements to the left of the current element
               3. Calculate the running product in the right to left direction. This is to determine the product of elements to the right of the current element
               4. Multiply left and right
*/
class productArray {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0 || nums == null) return null;
        int[] output = new int[nums.length];
        output[0] = 1;
        for(int i = 1; i < nums.length; i++){
            output[i] = nums[i-1] * output[i-1];
        }
        int temp = 1;
        for(int i = nums.length-1; i >=0 ; i--){
            output[i] = output[i] * temp;
            temp *= nums[i];
            
        }
        return output;
    } 
}
