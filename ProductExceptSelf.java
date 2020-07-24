// Time Complexity : O(N)
// Space Complexity : O(1), only using the result array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// To get the product of all elements but self, we should get product of elements on left and on right of the element X.
// Also, the elements on first and last position will have 1 as the product on their left and right side correspondingly.
// So we can run through the array once to get all the cumulative products from the left. Perform same steps from the right
// and store in another array. Finally, multiple elements at each index to get product of  elements on left and elements
// on right of an element at that index.

// Your code here along with comments explaining your approach
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        if (len == 0) {
            return result;
        }

        int[] a = new int[len];

        a[0] = 1;
        int multi = 1;
        /*Multiple elements on left of index i*/
        for (int i = 1; i < len; i++) {
            multi *= nums[i - 1];
            a[i] = multi;
        }

        multi = 1;
        /*Multiple elements on right of index i and
         multiple the result with product on left*/
        for (int i = len - 1; i >= 0; i--) {
            int product = a[i];
            a[i] = multi * product;
            multi *= nums[i];
        }


        return a;
    }
}
