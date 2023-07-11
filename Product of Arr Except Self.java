// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*We find the running from of the elements in nums from left to rightand store it in the result array. 
 * Then we find the running product from right to left of the nums array and multiply it with the running products found in the left pass.
 */
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
    int[]result=new int[n];
    int rp=1; //running product
    result[0]=1; //this will store the running product of the elements in the array

//Left Pass
    for(int i=1;i<n;i++)
    {
//Calculating the running product until the last element
        rp=rp*nums[i-1]; 
//storing it in the result array
        result[i]=rp;
    }

//Right Pass
//We update the value of rp again to 1 since this is another pass
    rp=1; 
    for (int i=n-2;i>=0;i--)
    {
//running product from the right side to the current element
        rp=rp*nums[i+1]; 
//multiplying the running product with the running products received from the left pass
        result[i]=rp*result[i];
    }

    return result;
}


    }

