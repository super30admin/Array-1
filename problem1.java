class Solution {
    public int[] productExceptSelf(int[] nums) {

        // TC:o(n), SC:o(n) using 3 for loops
        // int N=nums.length;
        // int[] leftProd=new int[N];
        // int[] rightProd=new int[N];
        // int[] output=new int[N];
        // leftProd[0]=1;
        // rightProd[N-1]=1;
        // for(int i=1;i<N;i++)
        // leftProd[i]=nums[i-1]* leftProd[i-1];
        // for(int j=N-2;j>=0;j--)
        // rightProd[j]=nums[j+1]*rightProd[j+1];
        // for(int k=0;k<N;k++)
        // output[k]=leftProd[k]*rightProd[k];

        // return output;

        // TC:O(n) SC:O(1) solution
        // Hint Use preProduct and suffix product

        int N = nums.length;
        int[] out = new int[N];
        int preProd = 1;
        int suffixProd = 1;

        for (int i = 0; i < N; ++i) {
            out[i] = preProd;
            preProd *= nums[i];

        }
        for (int j = N - 1; j >= 0; --j) {
            out[j] *= suffixProd;
            suffixProd *= nums[j];
        }
        return out;
    }
}