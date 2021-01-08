# Array-1

## Problem 1
https://leetcode.com/problems/product-of-array-except-self/
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ret[]=new int[nums.length];
        int forwardpass[] = new int[nums.length];
        int backpass[] = new int[nums.length];
        forwardpass[0]=1;
        backpass[nums.length-1]=1;
        int rp=1;
        for(int i=1;i<=nums.length-1;i++){
            forwardpass[i]=rp*nums[i-1];
            rp=forwardpass[i];            
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--){
            backpass[i]=rp*nums[i+1];
            rp=backpass[i];
        }
        for(int i=0;i<=nums.length-1;i++){
            ret[i]=forwardpass[i]*backpass[i];   
        }             
        return ret;
    }
}



## Problem 2
https://leetcode.com/problems/diagonal-traverse/
// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];
        int res[] = new int[matrix.length*matrix[0].length];
        int index=0; int i=0; int j=0; int dir=1;
        while(index < res.length){
            res[index]=matrix[i][j];
            if(dir==1){
                if(j==matrix[0].length-1){
                    i++;
                    dir=-1;
                }
                else if(i==0){
                    j++; 
                    dir=-1;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==matrix.length-1){
                    j++;
                    dir=1;
                }
                else if(j==0){
                    i++; 
                    dir=1;
                }
                else{
                    i++;
                    j--;
                }
            }
        
            index++;
        }
        return res;
        
    }
}


