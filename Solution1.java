// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english:
//find product of elements to left of index,
//find product of elements to right of index,
//merge both to find product of all elements except itself

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0]=1; //left array is product of all elements to left of index
        for(int i=1;i<left.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[right.length-1]=1; //right array is product of all elements to right of index
        for(int j=right.length-2;j>=0;j--){
            right[j] = right[j+1] * nums[j+1];
        }

        int[] result = new int[nums.length];

        //merge both left * right
        for(int i=0;i<nums.length;i++){
            result[i] = left[i]*right[i];
        }

        return result;
    }
}