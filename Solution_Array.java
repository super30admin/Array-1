/*
// Time Complexity : O(n) + O(n)  = 2O(n) = O(n).// first time iterating all elements from the nums array for right array. 
// and then iterating one more time for main output.

// Space Complexity : O(1) as we are o/p requried list of array it doesn't count as a extra space.

// Did this code successfully run on Leetcode : Yes, worked 

// Three line explanation of solution in plain english : 

we have to find multiplication of elements except that element. so created on array which
 has name right array and and in that storing the all elements from that element on right. 
and then start iterating from the nums array and multiply with the right array.

*/
public class Solution_Array {

    public int[] productExceptSelf(int[] nums) {

        // checking null case
        if (nums.length == 0 || nums == null) {

            return new int[] {};
        }
        int n = nums.length;
        // creted an array with size of nums.

        int right[] = new int[nums.length];

        // last element doesn't have next element so putting 1 for that.

        right[n - 1] = 1;

        // temp will do multiplicatio of next elements.

        int temp = 1;

        // iterating from n - 2 beacause we already filled n-1 as 1.

        for (int i = n - 2; i >= 0; i--) {

            // multiplying the next element in nums array and temp .

            right[i] = nums[i + 1] * temp;

            // changing the temp for next variable

            temp = right[i];
        }

        int sum = 1;

        for (int i = 0; i < nums.length; i++) {

            // checking if i ==0 then doesn't have previous element.

            if (i == 0) {

                // adding sum here beacause if nums[i] has value minus(-) then we can change
                // update next value

                sum = sum * nums[i];
                nums[i] = right[i];

            } else {

                int temp_Variable = nums[i];

                nums[i] = right[i] * sum;

                sum = sum * temp_Variable;
            }
        }
        // returning the updated nums array .

        return nums;
    }
}
