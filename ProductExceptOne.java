// Time Complexity : O(n) - n - length of array
// Space Complexity :O(1) - we are using the same array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english


//Fix the first index as there is no element to the left of first index.
//First we will do the product of numbers to the left of curr number.
//Fix the last index of output array. 
//Then do right product by keeping a temp variable. Multiply temp by cur element of output. 
//Change temp = temp * input element.

public class ProductExceptOne{

    public static int[] productExcept(int[] arr){

        int[] L = new int[arr.length];

        L[0]=1;

        for(int i=1; i<arr.length; i++){
            L[i] = L[i-1]*arr[i-1];
        }
        int R = arr[arr.length-1];

        for(int j=arr.length-2; j>=0; j--){
            L[j] = L[j]*R;
            R = R * arr[j];
        }
        return L;
    }

    public static void main(String[] args){
        int[] arr = {0,2,3,4};
        int[] res = productExcept(arr);

        for(int num: res){
            System.out.println(num);
        }
    }


}