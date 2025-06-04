class ProductExceptSelf {
    /*

    Approach : We maintain the prefix product till index i (excluding element at index i) and suffix product at till i starting from end. 
    The product of prefix and suffix will give the product except self  

    TC : O(n)
    SC : O(n)

    */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int prefixProd = 1;
        //for nums = [1,2,3,4]
        for (int i=0;i<n;i++){
            result[i]= prefixProd;
            prefixProd*=nums[i];
        }
        // at the end result  will look like [1,1,2,6]
        int suffixProd = 1;
        for(int i= n-1;i>=0;i--){
            result[i]*=suffixProd;
            suffixProd*=nums[i];
        }
        // at the end the result will look like [24,12,8,6]
        return result;
    }

    /*
    
     public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[]= new int[n];
        int prefProdSoFar = 1;
        int sufProdSoFar = 1;
        for(int i=0;i<n;i++){
            prefProdSoFar*=nums[i];
            pre[i]=prefProdSoFar;
            sufProdSoFar*=nums[n-1-i];
            suf[n-1-i]=sufProdSoFar;
        }
    
        int output[]=new int[n];
        for(int i=0;i<n;i++){
            int prev = 1;
            if(i-1>=0){
                prev = pre[i-1];
            }
            int suff = 1;
            if(i+1<n){
                suff=suf[i+1];
            }
            output[i]= prev*suff;
        }
        return output;
    }
    
    */
}