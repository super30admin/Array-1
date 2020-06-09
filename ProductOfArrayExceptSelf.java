/**
 * Time Complexity : O(n) where n = size of nums array
 * Space Complexity : O(1)
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0) return new int[0];
        int n = nums.length;
        int[] result = new int[n];
        int runningProduct=1;
        int temp = 1;
        for(int i=0;i<n;i++){
            runningProduct = runningProduct*temp;
            result[i] = runningProduct;
            temp = nums[i];
        }
        runningProduct = 1;
        temp = 1;
        for(int i=n-1;i>=0;i--){
            runningProduct = runningProduct*temp;
            result[i] = result[i] * runningProduct;
            temp = nums[i];
        }
        return result;
    }

    public static void main(String args[]){
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] myArr = new int[]{1,2,3,4};
        int[] result = obj.productExceptSelf(myArr);
        for(int x: result)
            System.out.print(x+",");
    }
}