// Time complexity : O(n)
// Space complexity : O(1)

class ProductExceptself {
    public int[] productExcept(int[] nums) {
        int[] result = new int [nums.length];
        int sum = 0, temp = 0;
        for(int i = 0; i <= nums.length-1; i++){
            sum = sum * temp;
            result[i] = sum;
            temp = nums[i];    
        }

        sum = 0; temp = 0;
        for(int i = nums.length-1; i >= 0; i--){
            sum = sum * temp;
            result[i] = sum;
            temp = nums[i];    
        }
        return result;
    }
}