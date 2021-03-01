// Time Complexity :
o(2n) ==> o(n) since we are traversing the input once from front and once back
// Space Complexity :
O(n) we are maintaing a temp array to store the product calculated from 
right side of the element
// Did this code successfully run on Leetcode :
YES
// Three line explanation of solution in plain english


// Your code here along with comments explaining your approach


Input:  [1,2,3,4]
Output: [24,12,8,6]


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] ans = new int[len];
        ans[0]=1;
        for(int i=1;i<len;i++){
            ans[i]=nums[i-1]*ans[i-1]; 
            /*ans[1]= 1*1 =1
            ans[2]= 2*1 = 2
            ans[3]= 3*2 = 6
            */
        
        }
        for(int j=nums.length-2,temp=1;j>=0;j--){
            temp*=nums[j+1];
            /*

            j=2 temp=1*4 =4
            j=1 temp=4*3=12
            j=0 temp= 12*2=24
            */
            ans[j]*=temp;
            /*
            ans[2] = 2*4=8
            ans[1] = 1*12=12
            ans[0] = 1*24=24
            */

        }
        return ans;
    }
}