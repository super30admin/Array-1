package s30.arrays.array1;

// Time Complexity: O(n) // it is O(2n) asymptotically it will be O(n);
// Space Complexity: O(1); // As we are using output array.
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int res[] =  new int[nums.length];

        int prefix = 1;

        for(int index =0; index < length; index++){
            res[index] = prefix;
            prefix *=  nums[index];
        }

        int suffix = 1;

        for(int index=length-1; index >= 0; index--){
            res[index] *= suffix;
            suffix *= nums[index];
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1,2,3,4}));
    }
}
