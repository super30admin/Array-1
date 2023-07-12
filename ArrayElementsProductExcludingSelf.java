public class ArrayElementsProductExcludingSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int runningProduct = 1;

        result[0] =1;
        for(int i = 1; i < length; i++){
           runningProduct = runningProduct * nums[i-1];
           result[i] = runningProduct;
        }

        runningProduct = 1;
        for(int i = length -2; i>= 0; i--){
            runningProduct = runningProduct*nums[i+1];
            result[i] = result[i]*runningProduct;
        }

        return result;
        
    }
}
