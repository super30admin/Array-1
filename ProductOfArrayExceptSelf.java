//TC: O(n)
//SC: O(n)
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        int prod = 1;
        temp[0] = prod;
        for(int i = 1; i < nums.length; i++){
            prod = prod * nums[i-1];
            temp[i] = prod;
        }
        int mult = 1;
        for(int i = nums.length - 1; i >=0 ; i--){
            int var = nums[i];
            nums[i] = temp[i]*mult;
            mult = mult*var;
        }
        return nums;
    }
}
