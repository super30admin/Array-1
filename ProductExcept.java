// TC: O(N) where N represents the number of elements in the array
// SC: O(N)  where we using it for storing values in extra array

// We are trying to store left sum of each number and right sum of that number, we are multiplying left and right sum for that particular number in array


public class ProductExcept {
	
	public void Prod(int[] nums) {
	// Approach 1 - with 2 arrays
//		int L[] = new int[nums.length];
//		int R[] = new int[nums.length];
//		int len = L.length;
//		L[0]=1;
//		for(int i=1;i<L.length;i++)
//			L[i] = L[i-1] * nums[i-1];
//			                     
//		
//		R[len-1] = 1;
//		
//		for(int i=len-2;i>=0;i--)
//			R[i] = R[i+1]*nums[i+1];
//		
//		for(int i=0;i<nums.length;i++) {
//			nums[i] = L[i]*R[i];
//		}
//		return nums;
	//Approach 2 - With single array	
		int[] res =  new int[nums.length];
		res[0] = 1;
		for(int i=1;i<nums.length;i++)
			res[i] = res[i-1]*nums[i-1];
		
		int R = 1;
		
		for(int i=nums.length-1;i>=0;i--)
		{
			res[i] = res[i] * R;		
			R*=nums[i];
		}
		for(int i=0;i<nums.length;i++)
			System.out.println(res[i]);
	}
	
	public static void main(String[] args) {
		
		ProductExcept pe = new ProductExcept();
		int[] nums = {1, 2, 3, 4};
		pe.Prod(nums);
//		for(int i=0;i<nums.length;i++)
//			System.out.println(nums[i]);
//		
	}

}
