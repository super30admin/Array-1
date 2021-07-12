class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] left = new int [nums.length];
        int [] right = new int[nums.length];
        int [] result = new int[nums.length];

        left[0] = 1;
        for(int i=1;i<nums.length;i++){
            left[i] = nums[i-1] * left[i-1];
        }
        right[nums.length-1] = 1;
        for(int i= nums.length-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i=0;i<result.length;i++){
            result[i] = right[i]*left[i];
        }
        return result;

    }
//time complexity : O(N) where N is the length of the input array.
 //Space Complexity : O(N) using Auxiliary space for storing output.
    public static void main(String[] args){
        ProductExceptSelf p = new ProductExceptSelf();
        int nums[] = {1,2,3,4};
        int [] result2 = p.productExceptSelf(nums);
        for(int i=0;i<result2.length;i++){
            System.out.print(result2[i]+" ");
        }

    }
}