package com.array1;

public class ProductofArrayExceptSelf {


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] res = new int[nums.length];

        int left = 1 ;

        for(int i = 0 ; i<nums.length; i++){

            if(i>0){
                left = left * nums[i-1];

            }

            res[i] = left;

        }

        int right =1 ;
        for(int i=n-1; i>=0 ; i--){
            if(i< n-1){

                right = right * nums[i+1];

            }
            res[i] = res[i] * right;
        }



        return res;

    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf sol = new ProductofArrayExceptSelf ();

        int[] res;
        res = sol.productExceptSelf (new int[]{1,2,3,4});
        for (int n :
                res) {
            System.out.println (n);
        }

    }

}
