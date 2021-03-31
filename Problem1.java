///Array Product Except Self
// Time Complexity : O(n)
// Space Complexity : O(n) Constant
// Did this code successfully run on Leetcode : Yes
//Approach 
/*
Take the product of the whole array and then traverse the 
array and for each element and add the division of totalProduct and 
that element and store in the same input array
so out space complexity will not increase
*/
public class Problem1 {
    public static void main(String[]args){
        int[] inputArr = {1,2,3,4};
        int[] res = productExceptValue(inputArr);
        for(int each : res){
            System.out.println(each);
        }


    }
    
    public static int[] productExceptValue(int[] arr){
        int rp = 1;
        int[] leftArray = new int[arr.length];
        // int[] rightArray = new int[arr.length];
        int[] res = new int[arr.length];
        res[0] = rp;
        for(int i = 1;i< arr.length; i++){
            rp  = rp* arr[i-1];
            res[i] = rp;
        }
        rp = 1;
        for(int j = arr.length-2; j>=0;j--){
            ///we take the multiplication of 
            // two arrays, hence we take multiplication of 
            //rp & arr[j+1] and then updat the result arry

            rp = rp * arr[j+1];
            res[j] = rp* res[j];

        }
        return res;


    }
    
}
