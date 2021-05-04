/*
Leet Code Problem 498
Diagonal Traverse
Language Used : Java
Link: https://leetcode.com/problems/diagonal-traverse/
Runtime: 2 ms, faster than 91.17% of Java online submissions for Diagonal Traverse.
Memory Usage: 40.8 MB, less than 72.64% of Java online submissions for Diagonal Traverse.

Logic: Direction of the traversal needs to be tracked and changed according to differnet cases
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //null check
        if(mat==null||mat.length==0) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        int []res = new int [m*n];
        //3 counters 1 for result and 2 for the two dimentional array
        int i = 0;
        int r = 0;
        int c = 0;
        //Set direction as 1 initially
        int dir = 1;
        //Using while as looping variable need different values
        while(i<m*n)
        {
            res[i]=mat[r][c];
            if(dir==1){
                // Direction is towards up
                if(c==n-1){
                    //If it reaches end direction needs to be changed
                    r++;
                    dir=-1;
                }
                else if(r==0){
                    c++;
                    dir=-1;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                //Direction is towards bottom/down
                if(r==m-1){
                    //If it reaches bottom direction needs to be changed
                    c++;
                    dir=1;
                }
                else if(c==0){
                    r++;
                    dir=1;
                }
                else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        return res;
    }
}