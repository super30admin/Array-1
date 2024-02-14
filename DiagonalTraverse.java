//Time Complexity = O(m*n)
//Space Complexity = O(1) // Because return Datastructure is not considered in Aux Space
// Does it run on LeetCode successfully?: Yes
// Any difficulties: Finding difficulties in finding for loop condition. For - while combination here.

/*
Traversing Matrix Diagonally: Leetcode 498: https://leetcode.com/problems/diagonal-trave rse/description/
*/

//Tip: Always take symmetric & Asymmetry matrixs to figure out all conditions
import java.util.Arrays;

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null) return new int[] {};
        int m = mat.length; // rows
        int n = mat[0].length; //columns
//      int[] result = new int[mat.length*mat[0].length];
        //Output so it wont be considered aux space
        int[] result = new int[m*n]; // Total element after traversal will be m*n
        boolean dir = true; //true is upward direction, false is downward direction
        int i = 0, j = 0;

        for(int idx = 0; idx<m*n; idx++) {
//           System.out.println("j " + j);
            result[idx] = mat[i][j];
            //traverse in upward directions
            if (dir) {
                if (j == n - 1) {
                    i++;
                    dir = false;
                } else if (i == 0) {
                    j++;
                    dir = false;
                    //System.out.println("j " + j);
                } else {
                    i--;
                    j++;
                }
            } else { //traverse in downward direction
                if (i == m - 1) {
                    j++;
                    dir = true;
                } else if (j == 0) {
                    i++;
                    dir = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        DiagonalTraverse obj = new DiagonalTraverse();
//        int[][] mat = new int[][] { {1,2,3},{4,5,6},{7,8,9} };
        int[][] mat = new int[][] { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
        System.out.println(Arrays.toString(obj.findDiagonalOrder(mat)));
    }
}