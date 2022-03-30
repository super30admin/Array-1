// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    // 3 cases: Case 1. if nums contains 2 or more zeros --> product will always be 0
    // Case 2. if nums contains 1 zero --> product will be zero except for when we are at the index where the value is 0, in that case we return the product of all the other numbers in nums
    // Case 3. no zeros --> need to find way to actually get product except self without division using two for loops, one starting from the start, the other starting from the end and updating values

// Your code here along with comments explaining your approach
class ProductExceptSelfSolution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1; // product without zeros
        int zeros = 0;
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                product = product * nums[i];
            }
            else{
                zeros++;
            }
        }
        
        if (zeros >=2){ // product always 0 if there is 2 or more zeros
            for (int i = 0; i < nums.length; i++){
                array[i] = 0;
            }
        }
        
        else if (zeros == 1){ 
            for (int i = 0; i < nums.length; i++){
                if (nums[i] == 0){
                    array[i] = product;
                }
                else{
                    array[i] = 0;
                }
            }
        }
        
        else{ // no zeros
            array[0] = 1;
            int tmpProduct = 1;
            for (int i = 0; i < nums.length - 1; i++){
                tmpProduct *= nums[i];
                array[i+1] = tmpProduct;
            }
            tmpProduct = nums[nums.length - 1]; // reset to last value in nums array
            for (int j = nums.length - 2; j >= 0; j--){ // reverse
                array[j] *= tmpProduct;
                tmpProduct *= nums[j];
                
            }
        }
 
        return array;
    }
}
