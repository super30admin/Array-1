
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	 public static int[] productExceptSelf(int[] nums) {
		 int[] output = new int[nums.length];
		 int running_product = 1;
		 for(int i =0;i<nums.length;i++) {
			 output[i] = running_product;
			 running_product = running_product*nums[i];
		 }
		 running_product = 1;
		 for(int i =nums.length-1;i>=0;i--) {
			 output[i] = output[i]*running_product;
			 running_product = running_product*nums[i];
		 }
		 return output;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5 };
		int[] output = productExceptSelf(array);
		System.out.println(Arrays.toString(output));
	}

}
