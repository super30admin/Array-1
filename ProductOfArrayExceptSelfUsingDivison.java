public class ProductOfArrayExceptSelfUsingDivison {
    //Using division method
    //TC will O(N^2)
    //SC will be O(1)
    public int[] productExcept(int[] nums) {
        if(nums==null || nums.length==0){
            return new int[]{};
        }
        int n = nums.length;
        int rp=1;
        int[] result= new int[n];
        for(int i = 0; i<n ; i++){
            rp = rp * nums[i];
        }
        for(int i = 0; i<n; i++){
            result[i] = rp/nums[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        ProductOfArrayExceptSelfUsingDivison obj = new ProductOfArrayExceptSelfUsingDivison();
        int[] result= obj.productExcept(nums);

        for (int num : result){
            System.out.println(num);
        }

    }
}
