
public class Product_of_Array_Except_Self {
	//Approach: 1. To calculate the product without division, here we follow the approach of creating 2 arrays leftproducts and rightproducts
	//2. Leftproduct array will contain the product of all elements to the left of an index. Rightproduct array will have product of all elements to the right of an index.
	//3. Finally we multiply the leftproduct indexed element with rightproduct indexed element to get the product of whole array except the element at that index.
	//4. Here I have tried limiting space, so stored the leftproducts in result array and used it while calculating rightproduct array to get the result.
	public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return new int[0];
        int[] products = new int[nums.length];
        int temp = 1, product = 1;
        
        for(int i=0;i< nums.length;i++)
        {
            product = product * temp;
            temp  = nums[i];
            products[i] = product;
        }
        product = 1;temp=1;
        
        for(int i=nums.length-1;i >=0 ;i--)
        {
            product = product * temp;
            temp  = nums[i];
            products[i] *= product;
        }
        return products;
    }
}
//Time Complexity : O(n) 
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :