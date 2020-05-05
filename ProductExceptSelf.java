package com.ds.rani.array;

//Approcah:
//Input :1, 2, 3, 4
//         I have to calculate product of left and product of right for every elemnt and then multiply it. eg. for 3
//             1      2    3    4
// leftproduct 1      1    1*2  1*2*3
// right produ 3*4*2  3*4  4    1
//             for 3 result is:1*2*4=8

public class ProductExceptSelf {

    //Time Complexity:o(n) where n is input array size
    //space complexity:o(1):the output array does not count as extra space for the purpose of space complexity analysis.
    /**
     *
     * @param nums
     * @return
     */
    public  static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];

        // multiplication from left side;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                result[i]=1;
            }else
            {
                result[i]=nums[i-1]*result[i-1];
            }
        }
        // multiplication of left and  right side
        int previousMul=0;
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){
                 previousMul=nums[j];
            }
            else{
                result[j]*=previousMul;
                previousMul*=nums[j];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println( productExceptSelf( arr ) );
    }
}
