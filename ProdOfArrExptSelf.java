// Tc 0(n)
// Sc 0(n)

import java.util.Arrays;

public class ProdOfArrExptSelf {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };

        ProdOfArrExptSelf obj = new ProdOfArrExptSelf();

        int[] obj1 = obj.addArr(arr);

        System.out.println("Array is = " + Arrays.toString(obj1));

    }

    public int[] addArr(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = 1;

        // left part

        for (int i = 1; i < n; i++) {
            rp *= nums[i - 1];
            result[i] = rp;

            // right part
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1];

            result[i] = rp * result[i];

        }
        return result;

    }

}
