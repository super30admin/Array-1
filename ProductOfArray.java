// Time Complexity : O(n), n is the number of elements
// Space Complexity : O(n + n) = O(n), for left and right product arrays
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english:
//take 2  arrays , calcualte product from left to rigth and save in left array
//calculate product from right to left and save in right array
//product is cumulative
//finaly multiple each element in order of left and right arrays and save in result array


class ProductOfArray {
    public int[] productExceptSelf(int[] nums)
        
   {
//         //O(n) time and O(n)space approach;
        
//         //algorithm:
         /*
        traverse the array from left to right starting from index 1:
        L[i] = nums[i-1]*L[i-1];
        
        traverse the array from right to left starting from index length-2;
        R[i] = nums[i+1] *R[i+1];
        
        for result array: starting from index 0,
        multiply L[i] * R[i] = res[i];
        */
        
        int len = nums.length;
        
        int[]leftProduct = new int [len];
        leftProduct[0] = 1;
        
        int[]rightProduct = new int[len];
        rightProduct[len-1]  =1;
        
        for(int i = 1; i < len;i++)
        {
            leftProduct[i] = nums[i-1] * leftProduct[i-1];
        }
        
        for(int i = len-2; i >=0 ; i--)
        {
            rightProduct[i] = nums[i+1]*rightProduct[i+1];
        }
        
        int[]res = new int[len];
        for(int i =0; i < len; i++)
        {
            res[i] = leftProduct[i] * rightProduct[i];
        }
        
        return res;
            
    }
       
}    
