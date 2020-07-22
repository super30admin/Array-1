//Time Complexity: O(n) length of array
//space complexity:O(1)
/*Approach
-Traversing through the array and computing running product ,storing it in result array
-but starting from 1 because we have to compute except self
-doing the same but in opposite direction from right to left starting from 1 and computing
running product and multiplying it with the values already in result
-the result will contain product of everything except self because while going from l->r
we are computing the products of number before it, and while going from r->l we are computing
the product of numbers after it, so altogether it will be product of array except self.
 */
public class ProductOfArrayExceptSelf{
    public static int[] product(int[] arr){
        if(arr.length == 0 || arr == null) return new int[]{};
        int[] result = new int[arr.length];
        int product = 1;
        int temp = 1; 
        for(int i = 0;i < arr.length;i++){
            product *= temp;
            result[i] = product;
            temp = arr[i];
        }
        temp = 1;
        product = 1;
        for(int i = arr.length-1 ;i >= 0;i--){
            product *= temp;
            result[i] *= product;
            temp = arr[i];
        }
        return result;
    } 
    public static void main(String args[]) {
        int[] arr = new int[]{1,2,3,4};
        int[] result = product(arr);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

    }
}