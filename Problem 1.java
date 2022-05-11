class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length]; //define new array result of size nums length
        int n=nums.length; //also vairable n stores nums length value
        //null case
        if(nums == null || nums.length==0)return result; //check if the array nums is null
        int rp=1; //define running product integer as 1
        result[0]=1; //define first element of array result s 1
        //for front side running product
        for(int i=1; i<n ; i++){ 
            rp *= nums[i-1];  //multiply the running product from first element till the previous element of the current element
            result[i] = rp; //add this into the result array
        }
        //for back side
        rp=1;
        for(int i= n-2; i>=0; i--){   //find running product from backside but till the previous element
            rp = rp*nums[i+1];  //gives running product from back sidd
            result[i] = result[i]*rp; //mutiply the previous and new obtained to give running arrays for all elements except itself
        }
        return result;
    }
}

// Time complexity: O(n)
//space complextiy: O(1)