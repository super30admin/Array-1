import java.util.Arrays;

public class ProductArrayExceptSelf {

        public int[] productExceptSelf(int[] nums) {

            int n = nums.length;
            int[] result = new int[n]; // O(1) given in problem

            // left running product pass

            int lrp = 1;

            result[0] = 1;

            for(int i= 1; i < n; i++){ // O(n)

                lrp = lrp*nums[i-1];

                result[i] = lrp;

            }


            // multiplied by right running product pass

            int rrp = 1;

            for(int i = n-2; i >= 0; i--){ // O(n)

                rrp = rrp* nums[i+1];

                result[i] *= rrp;

            }

            return result;
        }

        /* Time Complexity: O(n)
        Space Complexity: O(1) */

        public static void main(String[] args){

            ProductArrayExceptSelf object = new ProductArrayExceptSelf();

            int[] arrayInput = {1,2,3,4};

            int[] answer = object.productExceptSelf(arrayInput);

            System.out.println("Product of array except self: " + Arrays.toString(answer));
        }
}

