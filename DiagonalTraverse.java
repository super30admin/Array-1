/*
 * Time Complexity : O(m*n)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 * 
 * Approach : We start traversing the array from the index 0,0 and keep track of the direction. If we are traversing upwards, then if we reach the top row we increment the column value if we reach the 
 * last column we increment the column value, until then we push the element occuring diagonally by decremnting r by 1 and incrementing c by 1 at each step. If the edge conditions are reached 
 * we flip the directions. If we are traversing the diagonal downwards, if we reach the last row then we increment c by 1 and if we reach the first column , we increment row by 1. Until then
 * we traverse the diagonal by r++ and c--
 * 
 * https://leetcode.com/problems/diagonal-traverse/description/
 */

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;int n=mat[0].length;
        int[] result = new int[m*n];
        int dir = 1;
        int r=0, c=0,index=0;
        while(index<result.length){
            result[index]=mat[r][c];
            if(dir==1){
                if(c==n-1){
                    r++;
                    dir=-1;
                }else if(r==0){
                    c++;
                    dir=-1; 
                }else{
                    r--;
                    c++;
                }
            }else if(dir==-1){
                if(r==m-1){
                    c++;
                    dir=1;
                }else if(c==0){
                    r++;
                    dir=1;
                }else{
                    r++;
                    c--;
                }
            }
            index++;
        }
        return result;
    }
}