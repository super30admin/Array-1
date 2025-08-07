class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public int[] productExceptSelf(int[] nums) {
	 //  If an element is at the center of the array , the sub array product is obtained by multiplying the left side elements product and right side elements product
	// Idea is we traverse array from right to left in first traversal and calculate the right side elements products and store 
	//it in Output Array . After this , we traverse from left to right direction and multiply the left side products with right side products.
        int len = nums.length;
        int start = nums[len-1]; 
        int[] result = new int[len]; //Output Array 
        result[len-1] = 1;
        for(int i=len-2;i>=0;i--) //Loop to calculate rightside elements product
        {
            result[i] = start;  
            start = result[i]*nums[i]; 
        } 
        start = nums[0];
        for(int i=1;i<len;i++) //Loop to calculate leftside elements product
        {
            result[i] = result[i]*start;  //Multiplying rightside elements product with leftside elements products
            start = start*nums[i];
        }
        return result;
    }
}