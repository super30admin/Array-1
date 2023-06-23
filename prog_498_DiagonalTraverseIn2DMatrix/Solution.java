package prog_498_DiagonalTraverseIn2DMatrix;

public class Solution {
/*
Whenever we go upword row always decreases and column always increases
Whenever we go downward, row alwas increase and column decreases.
We will maintain a flag which will indicate whether we are moving upward or downward.

*/

    public int[] findDiagonalOrder(int[][] mat) {
        int r =0, c = 0 ; // we will start rows with 0 and columns = 0
        int index = 0 ;
        int m = mat.length ;
        int n = mat[0].length ;
        int len = mat.length * mat[0].length ;
        int result[] =new int[len];
        boolean up = true ; // we will always start by up direction.

        while(index <= len-1){ //untill we print all m * n elements
            result[index] = mat[r][c]; // we will put the r,c value into result matrix
            index++ ; // We are increasing the index by 1
            if(up == true){ // if direction is up
                if(r == 0 && c!=n-1){ // Suppose we are at r = 0 & c =0, we can't decrese r so we will be increasing
                    //'c'. What if r = 0 & c = n -1 then in that case it will always go to (element 3 [0,2])
                    //that's why in if condition we have added c!=n-1 condition
                    c ++ ;
                    up = false;
                }
                else if(c == n-1){ // This condition is for handling element 3[0, 2] If c is last column then move to
                    //down and increase the row
                    r++ ;
                    up = false ;
                }
                else{
                    r-- ;  // If its not edge case then decrese r and increase c
                    c ++ ;
                }
            }
            else{ // if direction is down
                if(c==0 && r!=m-1){ // same as up
                    r++ ;
                    up = true ;
                }
                else if(r==m-1){
                    c++ ;
                    up = true ;
                }
                else{
                    r++ ;
                    c-- ;
                }
            }

        }
        return result ;
    }
}
