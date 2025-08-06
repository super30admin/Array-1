/**Time Complexity: O(n)
 * Space Complexity: O(1) - output array is not counted
 * Did this program successfully run on Leetcode: Yes
 * Any problem you faced while coding this: No
 */
/**
 * The running product at each index on the left is stored by multiplying the element on the left with the running product at that point. Initially, these values are stored in my result array.
 * The result[0] is initialized to 1 because there are no elements to the left of the first element.
 * The rp is initialized to 1, which will hold the running product of elements to the right. Since there are no elements to the right of the last element, it starts with 1.
 * The running product at each index on the right is stored by multiplying the element on the right with the running product at that point. The result array is updated with this value multiplied by the existing value at that index.
*/
class arrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        

        int m=nums.length;
        int[] result=new int[m];
        result[0]=1;
        for (int i=1;i<=m-1;i++)
        {
            result[i]=result[i-1]*nums[i-1];
        }
        int rp=1;
        for(int j=m-2;j>=0;j--)
        {
            rp=rp*nums[j+1];
            result[j]=rp*result[j];
        }
        return result;
        
    }
}