// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.Arrays;

class productExceptSelf {
        public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0){
            return new int[] {};
        }

        int n=nums.length;
        int[] result=new int [n];
        int rp=1;
        result[0]=1; //nothing to the left of 1st element, so rp=1

        //start contructing left 
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1]; // accumulate product of all elements to the left of it, like running L to R and calculating product at each step
            result[i]=rp;
        }

        //result array is left now, create right and multipy now to get answer = final result array

        rp=1; //reset running product
        for(int i=n-2;i>=0;i--){ //start from second last value, backwards
            rp=rp*nums[i+1]; 
            result[i]=rp*result[i];
        }
        return result;
    }

    public static void main(String[] args) {
    productExceptSelf rs = new productExceptSelf();
    int[] arr = {1,2,3,4};
    int[] arr2 = {-1,1,0,-3,3};
    int[] result=rs.productExceptSelf(arr);
    int[] result2=rs.productExceptSelf(arr2);

    System.out.println(Arrays.toString(result));  // ans = [24,12,8,6]
    System.out.println(Arrays.toString(result2));  // ans = [0,0,9,0,0]
}

}