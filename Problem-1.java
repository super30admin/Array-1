// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/**
 *   For the first element, R[i] would be product except self
     For the last element of the array, product except self would be L[i]
     Else, multiple product of all elements to the left and to the right
 */

import java.util.*;

class ProductExceptSelf {
  public static int[] productExceptSelf(int[] nums) {

    int length = nums.length;

    int[] LeftArray = new int[length];
    int[] RightArray = new int[length];

    int[] answer = new int[length];

    LeftArray[0] = 1;
    for (int i = 1; i < length; i++) {

      LeftArray[i] = nums[i - 1] * LeftArray[i - 1];
    }

    System.out.println("LeftSub-Array:                                  " + Arrays.toString(LeftArray));

    RightArray[length - 1] = 1;

    // elements to the right of index 'i'
    for (int i = length - 2; i >= 0; i--) {
      RightArray[i] = nums[i + 1] * RightArray[i + 1];
    }

    System.out.println("RightSub-Array:                                 " + Arrays.toString(RightArray));

    // Constructing the answer array
    for (int i = 0; i < length; i++) {
      answer[i] = LeftArray[i] * RightArray[i];
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] inputs = { 1, 2, 3, 4 };
    System.out.println("Given Array:                                    " + Arrays.toString(inputs));
    int[] res = productExceptSelf(inputs);
    System.out.println("ProductArray of elements Except element itself: " + Arrays.toString(res));
  }
}
