//T.C: O(m*n)  no. of element in the matrix. 
//S.c: O(1) No extra data structure is used.

/*Approach: Here, we have a pattern where either the digonals will go up or down and in each case, like if goes up then it would breach top and right border of the matrix and while moving down it would breach Bottom and left border. i will take a flag to indicate the direction of the pointer,
if going up then update the flag to true and vice-versa.
*/


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean flag = true;
        int i = 0, j = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        

        for(int idx = 0 ; idx < res.length; idx++){
            res[idx] = mat[i][j];
            if(flag){
                if(j == n-1){
                    flag = false;
                    i++;
                }else if(i == 0){
                    flag = false;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }

             else{
                if(i == m-1){
                    flag = true;
                    j++;
                }else if(j == 0){
                    flag = true;
                    i++;
                }else{
                    i++;
                    j--;
                }
            }

        }
    return res;    
    }
}