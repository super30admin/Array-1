// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no



import java.util.ArrayList;
import java.util.List;

public class DiagMatrix {

        public int[] findDiagonalOrder(int[][] mat) {

            int [][] dire = {{-1,-1}, {-1, 0}, {-1, +1}, {0 ,1}, {1,1}, {1, 0}, {1,-1}, {0, -1}};

            int m = mat.length;
            int n = mat[0].length;
            int [] result = new int[ m * n];
            boolean up = true;
            int index= 0 ;
            int row = 0, col = 0 ;
            while (index < (m * n)){
                result[index] = mat[row][col];
                if (up){
                    if (col >= n -1){
                        row++;
                        up = false;
                    }
                    else if (row <= 0){
                        col++;
                        up = false;
                    }
                    else{
                        row--;
                        col++;
                    }
                }
                else {

                    if (row >= m -1) {
                        col++;
                        up = true;
                    }

                    else if (col <= 0) {
                        row++;
                        up = true;
                    } else {
                        row++;
                        col--;
                    }
                }
                index++;
            }
            return result;
        }

        public static void main(String [] args){
            int [][] nums = {{1,2,3},{4,5,6}};

            DiagMatrix obj = new DiagMatrix();
            System.out.println(obj.findDiagonalOrder(nums));
        }
    }
