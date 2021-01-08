/*  
 * Complexity of algorithm is O(n), where n is the number of elements in array
 *  
 * */
public class ProductofArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {

		if (nums == null || nums.length == 0)
			return new int[0];

		int runningProduct = 1;
		int[] result = new int[nums.length];
		result[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			runningProduct = runningProduct * nums[i - 1];
			result[i] = runningProduct;
		}

		runningProduct = 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			runningProduct = runningProduct * nums[i + 1];
			result[i] *= runningProduct;
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductofArrayExceptSelf objIn = new ProductofArrayExceptSelf();

		int[] nums = { 1, 2, 3, 4 };

		System.out.println(objIn.productExceptSelf(nums));

	}

}
