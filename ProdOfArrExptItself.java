// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Making two pass to take the product of elements from left to right and right to left to get the resultant array

public class ProdOfArrExptItself {
    public int[] productExceptSelf(int[] nums) {
        int[] newProductArr = new int[nums.length];

        int temp =1;


        for(int i = 0; i<nums.length; i++){
            newProductArr[i] = temp;
            temp = temp*nums[i];
        }
        temp =1;
        for(int j=nums.length-1; j>=0; j--){
            newProductArr[j] *=temp;
            temp = temp*nums[j];
        }
        return newProductArr;

    }
}
