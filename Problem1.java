// Time Complexity : O(n)
// Space Complexity : O(1) Constant
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
        if(arr == null || arr.length==0)
            return arr;
        int n = arr.length;
        ///totalProd = product of all elements in arr
        int totalProd = 1;
        for(int i : arr){
            totalProd *= i;
        }
        //divide each element to total product
        for(int i = 0;i< n; i++){
            arr[i] = totalProd/arr[i];
        }
        return arr;

    }
    
}
