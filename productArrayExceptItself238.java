package dec1st2020;

public class productArrayExceptItself238 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		System.out.println(productExceptSelf(arr));
	}

	public static int[] productExceptSelf(int[] nums) {

		// edge case
		if (nums == null || nums.length == 0)
			return new int[0];

//         int[] left = new int[nums.length];
//         int[] right = new int[nums.length];

//         for(int i = 0; i < nums.length; i++){
//             left[i] = (i == 0 ? 1 : left[i-1]) * nums[i];
//             right[nums.length-i-1] = (i == 0 ? 1 : right[nums.length-i]) * nums[nums.length-i-1];
//         }
//         int[] result = new int [nums.length];
//         for(int i = 0; i < nums.length; i++){
//             result[i] = (i == 0 ? 1 : left[i-1]) * (i == nums.length -1 ? 1 : right[i+1]);
//         }
//         return result;
//     }
		int temp = 1, rp = 1;
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			rp = rp * temp;
			result[i] = rp;
			temp = nums[i];
		}

		temp = 1;
		rp = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			rp = rp * temp;
			result[i] = result[i] * rp;
			temp = nums[i];
		}

		return result;

	}
}
