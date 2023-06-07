package Array1;

/**
 * 
 * 
 *Here we calculate the product of the elements to the left and store it in the corresponding index of leftProduct 
 *which is same as the index of the element in nums array. Then we start finding right product in a similar manner and 
 *use the left array itself to store the product of left subarray and right subarray for a particular element.
 * 
 * Time Complexity :
 * O(n) as we are looping through nums
 * 
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */

public class Problem1 {
	
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int [nums.length];
        leftProduct[0]=1;
        for(int i=1;i<leftProduct.length;i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }

        int prevRightProduct = 1;
        for(int i=nums.length-2;i>=0;i--){
            int currRightProduct=prevRightProduct*nums[i+1];
            prevRightProduct=currRightProduct;
            leftProduct[i]=leftProduct[i]*currRightProduct;
        }

        return leftProduct;

    }
}

