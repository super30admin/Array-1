// Time Complexity - O(N)
// Time Complexity - O(1)


class Solution {
    public int[] productExceptSelf(int[] nums) {


        // declare length
        int n = nums.length;

        // store left elements of the index element in finalAnswer array
        int finalAnswer[] = new int[n];

        // first element wont have any left element so initializing it to 1
        finalAnswer[0] = 1;

        for(int i = 1 ; i < n ; i++) {

            finalAnswer[i] = finalAnswer[i - 1] * nums[i - 1];


        }

        // last element will not have any element to the right so initializing it to 1
        int R = 1;

        for(int i = n - 1; i >= 0; i--) {

            finalAnswer[i] = finalAnswer[i] * R;

            R = R * nums[i]; // iterate through right array and store elements accordingly

        }

        return finalAnswer;
    }
}