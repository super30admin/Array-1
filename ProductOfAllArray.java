// instead of maintaining two arrays with product from left and right
//we have taken an array to store the product from the left
//when traversing right, skipping one element starting from n-2, we keep going left maintaining running product and updating the product in the result array

//thus, since we are traversing over the elements twice, time complexity is 2 O(n) -> O(n)
//space complexity is O(1) since we are storing everything in the output array, no extra auxillary space except one variable
//O(1)

public class ProductOfAllArray {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] result = productExceptSelf(nums);


        System.out.println("The ProductOfAllArray is");
        for (int i = 0; i < result.length; i++)
        {
            System.out.println("result[ "+  i + " ] = " + result[i]);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int rp = 1;
        int[] output = new int[n];
        output[0] = 1;

        for(int i=1; i<nums.length;i++)
        {
            rp = rp * nums[i-1];
            output[i] = rp;
            
        }

        rp = 1;
        for(int j=n-2; j>=0;j--)
        {
            rp = rp * nums[j+1];
            output[j] = output[j] * rp;
        }

        return output;

    }

    
}
