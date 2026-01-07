/*
Problem - Diagonal traverse, return array of elements in diagonal order
Approach - Start from the top-left and traverse the matrix diagonally.
Flip direction when hitting the matrix boundaries (top, bottom, left, right).
Keep updating the result array as you move in up-right or down-left directions.
Time Complexity - O(m*n)
Space Complexity - O(1)
 */


import java.util.Arrays;

public class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int [] res = new int[m*n];
        int r =0, c = 0;
        boolean direction = true;
        for(int i = 0; i < m*n; i++){
            res[i] = mat[r][c];
                if(direction){ // moving up
                    if(c == n - 1){
                        r++;
                        direction = false;
                    } else if (r == 0) {
                        c++;
                        direction = false;
                    }
                    else {
                        r--;
                        c++;
                    }
                }
                else{ // move down
                    if(r == m -1){
                        c++;
                        direction = true;
                    }
                    else if(c == 0){
                        r++;
                        direction = true;
                    }
                    else{
                        r++;
                        c--;
                    }
                }
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        DiagonalMatrix d = new DiagonalMatrix();
        int [] res = d.findDiagonalOrder(mat);
        System.out.println(Arrays.toString(res));
        int[][] mat2 = {{1,2},{3,4}};
        int [] res2 = d.findDiagonalOrder(mat2);
        System.out.println(Arrays.toString(res2));
    }

}
