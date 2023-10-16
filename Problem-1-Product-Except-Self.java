// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
/* Three line explanation of solution in plain english : We are taking resultant product (rp) and traversing left to right and getting all the left products and right to left and getting all the right products except the num itself. And finally we are mutiplying both the products. All this is stored in a result array */

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
		
	int result[] = new int[nums.length];//result array

	int rp=1;//resultant product (rp) 
	
	for( int i=0; i < nums.length; i++){
	
	result[i]=rp;// left products
	rp=rp*nums[i]; 
	
	}
     
	rp = 1;
	for( int i=nums.length-1; i>=0 ; i--){
	
	result[i]=rp*result[i]; // right products
	rp=rp*nums[i];
	
	}
	
	return result;
	 
    }
}
