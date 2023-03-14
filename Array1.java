// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * We maintain a running product from the leftside and another on the right side. 
 * The running product * previous element on the left gives the next elements value.
 * The running product * element on the right gives the previous value when traversing from right. 
 * The product of left and right gives us the answer. 
 */
class Array1 {
    public int[] productExceptSelf(int[] nums) {
        int rs=1;
        int res[] = new int[nums.length];
        res[0]=1;
        for(int i =1; i < nums.length;i++){
            rs = rs * nums[i-1];
            res[i] = rs;
        }
        rs=1;
        for(int j =nums.length-2; j >= 0;j--){
            rs = rs * nums[j+1];
            res[j] *= rs;
        }
        return res;
    }
}