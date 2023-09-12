
class ProductOfArrayExceptSelf {
    //return the array of products by mutating the result array
    //TC will be O(n), as iterating over the array
    //SC will be O(1), as just mutating the result array and not using additional array.
    public int[] productExcept(int[] nums) {
        if(nums==null || nums.length==0){       //base condnt to check if array is empty
            return new int[]{};       //return 0 as no product
        }

        int n= nums.length;     //length of array
        int[] result =new int[n];  //array to store product and return
        int rp=1; //running product
        result[0]= rp;         //intial value.

        for(int i= 1; i<n; i++){        //loop to iterate over the array to get left product
            rp = rp * nums[i-1];
            result[i]= rp;
        }

        rp = 1;  //again assigning value to running product in order to maintain right running product.
        for( int i = n-2 ; i>=0; i--){       //loop to iterate over the array to get right product.
            rp= rp * nums[i+1];
            result[i] = rp * result[i];     //current value i.e left value * running product.
        }
        return result; //return the array
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] result= obj.productExcept(nums);

        for (int num : result){
            System.out.println(num);
        }

    }

}