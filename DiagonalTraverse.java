//TC: O(m*n)
//SC:O(1)
//## Problem 2
//
//        Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
//
//        Example:
//
//        Input:
//
//        [
//
//        [ 1, 2, 3 ],
//
//        [ 4, 5, 6 ],
//
//        [ 7, 8, 9 ]
//
//        ]
//
//        Output: [1,2,4,7,5,3,6,8,9]
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];

        int r = 0; int c = 0;
        boolean dir = true;
        for(int i = 0; i < m*n; i++){
            result[i] = mat[r][c];
            if(dir){        //upward
                if(r==0 && c!=n-1){
                    c++;
                    dir = false;
                }else if(c == n-1){
                    r++;
                    dir = false;
                }else{
                    r--;c++;
                }
            }else{          //downward
                if(c==0 && r!=m-1){
                    r++;
                    dir = true;
                }else if(r == m-1){
                    c++;
                    dir = true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
