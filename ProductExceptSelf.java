/**
Problem: Product except self
Time Complexity : O(n), where n is the length of nums array.
Space Complexity : O(1), as we are just returning the result array and not creating an additional space for the purpose of solving.
(In class, we were told that in most cases, result array that we are asked to return is considered to have a space complexity of O(1)).
Did it run on leetcode : Yes

Approach 1: Brute Force Solution. O(n^2)
1. Iterate thru the array using two loops.
2. Multiply all the numbers except the current number using the condition where the numbers in two loops are different.
3. This gives us the product of all numbers excep the current number.

Approach 2: Use product lists(left and right). O(n)
1. For left product list, we make use of running product(product of numbers before a particular number).
2. For right product list, we do the same, but from right.
3. Now that we have two lists, the resultant array is nothing but the product of both the product lists.
4. Each element in the new array, is the product of the array except the current number.
 */


//Brute Force Solution : Time limit exceeded on LeetCode
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prod = 1;
        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<nums.length; i++) {
                if(j!=i) {
                    prod *= nums[j];
                }
            }
            result[i] = prod;
        }
}


//Optimal Solution
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int runningProduct = 1;
        int temp = 1;
        int count = 0;
        //left product list
        while(count<nums.length) {
            runningProduct *= temp;
            result[count] = runningProduct;
            temp = nums[count];
            count++;
        }
        
        //right product list, Here instead of using a new array, we are saving space by direcly multiplying it to the previous result array
        temp = 1;
        runningProduct = 1;
        for(int i = nums.length-1; i>=0; i--) {
            runningProduct *= temp;
            result[i] *= runningProduct;
            temp = nums[i];
        }
        return result;
    }
}