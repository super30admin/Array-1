// Time Complexity : o(n) N=n computations where n is length of the given array
// Space Complexity : o(n) to store the left product, where n is the length of the given array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* 
Calculate the left product: that is product of all elemnts to the left of the array 
Calculate the right product; that is the product of all the elements to the right of the array
Muktiply the left and right product for each element to get the product of all the elements except self
*/
// Your code here along with comments explaining your approach


class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int N = nums.length;
      
        //initilize the putput array
        int[] output = new int[N];
        
        //store in output, the product of all the elements to the left of the elemnt in each index of nums
         output[0] = 1;
        for(int i=1;i<N;i++){
            output[i] = output[i-1] * nums[i-1];
        }
        
        //while calucation the product of all the elements to the right of the element in each index, also multiply 
        //it with the left product stored in the output array.
       int R = 1;
        for(int i=N-1;i>=0;i--){
            output[i] = output[i]*R;
            R=R*nums[i];
        }

        return output;
    }
}