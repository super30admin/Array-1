
// Time Complexity :  O(N) + O(n) + On(n) --> O(n).
// Space Complexity : O(n)  --
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// brute force would multiply all elements and dived by its num[i]  to get the product value with out i's . As there is no division applicable.
// store the 1 array using the product of all items to left of i. 
// store the another array using the product of all items to right of i. 
// multiply left array corresponding element to right element is the anwer array.


class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        
        int length = nums.length;

       
        int[] L = new int[length];  // used store the product of all items to left of i, intially it will 1 as there are no items present to left.
        int[] R = new int[length];  // used store the product of all items to right of i, intially it will 1 as there are no items present to right.

        int[] answer = new int[length];  // solution array.

        // L[i] contains the product of all the elements to the left
        L[0] = 1;  //for the element at index '0', there are no elements to the left,
        for (int i = 1; i < length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }

        // R[i] contains the product of all the elements to the right
        R[length - 1] = 1;  //for the element at index 'length - 1', there are no elements to the right,
        for (int i = length - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];  // calculating the elements from right  to left.
        }

        // Constructing the answer array
        for (int i = 0; i < length; i++) {
            answer[i] = L[i] * R[i];
        }

        return answer;

    }
}
