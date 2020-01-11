public class ProductofArrayExceptSelfBigN25 {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		// edge case:
		if (nums.length == 0 || nums == null) {
			return result;
		}
		int temp = 1;
		int rProd = 1;
		for (int i = 0; i < nums.length; i++) {
			rProd = temp * rProd;
			result[i] = rProd;
			temp = nums[i];
		}
		temp = 1;
		rProd = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			rProd = temp * rProd;	
			result[i] = result[i] * rProd;
			temp = nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		ProductofArrayExceptSelfBigN25 prod = new ProductofArrayExceptSelfBigN25();
		int[] nums = { 1, 2, 3, 4 };
		for (int s : prod.productExceptSelf(nums))
			System.out.println(s);

	}

}
