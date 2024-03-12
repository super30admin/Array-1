// Time Complexity : O(n)
// Space Complexity : O(n) using LP and RP arrya. 
//                    Optimal - O(1) using rp var instead
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// traverse through the array twice, first maintaing the left product of the number
//second time storing the prod of elements to the right of the number
//then multiply both array. this uses extra space
//The optimized solution we can do it in O(1) where we store right product in a variable instead and keep multiplying the LP array with it



class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lprod = new int[n];
        int[] rprod = new int[n];
        int[] result = new int[n];
        lprod[0]=1;
        rprod[n-1]=1;

        for(int i =1;i<nums.length;i++){
            lprod[i]=lprod[i-1]*nums[i-1];
        }
        for(int j =n-2;j>=0;j--){
            rprod[j]=rprod[j+1]*nums[j+1];
        }
        for( int i = 0; i < nums.length ; i++){
            result[i] = lprod[i]*rprod[i];
        }

        return result;
    }

    public int[] OptimizedProductExceptSelf(int[] nums) {      
        int n = nums.length;
        int[] lprod = new int[n];
        int[] rprod = new int[n];
        int[] result = new int[n];
        result[0] = 1;
        int rp =1;
        //left prod
        for (int i = 1; i<n;i++){
            rp = rp*nums[i-1];
            result[i] = rp;
        }
        //right prod
        rp = 1;
        for (int i = n-2;i>=0 ; i--){
            rp = rp*nums[i+1];
            result[i] = rp * result[i];
        }
        return result;
     }
}