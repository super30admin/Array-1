package Array1;

public class question26_productArrayExceptSelf {

    /*
    Nested Iterations
        Time Complexity: O(n)
        Space Complexity:O(1)
    */
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        int runProd = 1;
        int result[] = new int[nums.length];
        result[0] = 1;
        //Forward Pass
        for(int i = 1 ; i < nums.length ; i++) {
            runProd = runProd * nums[i - 1];
            result[i] = runProd;
        }
        runProd = 1;
        //Backward Pass
        for(int i = nums.length - 2 ; i >= 0 ; i--) {
            runProd = runProd * nums[i + 1];
            result[i] = result[i] * runProd;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
