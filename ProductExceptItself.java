import java.util.Arrays;

public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int[] leftResult = new int[nums.length];
        int[] rightResult = new int[nums.length];
        int[] result = new int[nums.length];
        leftResult[0]=1;
        rightResult[nums.length-1]=1;
        //left pass
        for(int i=1; i< nums.length; i++){
            leftResult[i]=nums[i-1]*leftResult[i-1];
        }
        //right pass
        for(int i = nums.length-2;i>=0; i--){
            rightResult[i] = nums[i+1]*rightResult[i+1];
        }
        for(int i=0; i<nums.length; i++){
            result[i] = leftResult[i]*rightResult[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ProductExceptItself obj = new ProductExceptItself();
        int[] nums= new int[]{1,2,3,4,5};
        int[] res = obj.productExceptSelf(nums);
        System.out.println("Res -- " + Arrays.toString(res));
    }
}
