//here the problem statement says that we want an array consisting of product of the entire array except for the element and that index.  if we observe the product of all the elements except itself is the same as the product of all the elements towards the left of the element and with the product of all the elements towards the right of the element.  to get this Behavior I am using the running product variable to efficiently track the running product of all the elements left to the current element. Then I'm again traversing from left to right after resetting the running product variable to efficiently track the product of the elements towards the right of the current element and then multiplying it with the result[ ] initially had consisting of the product of all the elements left of the current elements such that we get the behavior where we are multiplying left product with the right product of that element. By doing this I'm optimizing the space by not having a array for the product of right elements.
//time complexity-O(2n) since we are tranversing the twice along the array.
// space complexity-O(1) as the only extra space is for the variables which would be O(1).
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = rp;
        //L->R to get leftProduct
        for (int i = 1; i < n; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        //getting the rightProduct and storing it in the rp then multiplying it with the left running product
        for (int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            result[i] = result[i] * rp;

        }

        return result;
    }
}
