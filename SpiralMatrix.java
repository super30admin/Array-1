//Time Complexity = O(m*n) //We have to traverse all elements
//Space Complexity = O(1) // Because return Datastructure is not considered in Aux Space
// Does it run on LeetCode successfully?: Yes
// Any difficulties: Not able to come up with solution on my own at the very beginning. Need lecture support.
                    // While loop rotation conditions checks
/*
Traversing Matrix Diagonally: Leetcode 54: https://leetcode.com/problems/spiral-matrix/description/
*/

//Tip: Always take symmetric & Asymmetry Matrix to figure out all conditions

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null) return null;
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>(m*n);

        int top =0;
        int bottom=m-1; //last row

        int left = 0;
        int right = n-1; //last column

        while(left <= right && top <= bottom){

            //top row
            for(int i= left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            //right column
            for(int j=top; j<=bottom; j++){
                list.add(matrix[j][right]);
            }
            right--;

            //bottom row
            if(top<=bottom){
                for(int k=right; k>=left; k--){
                    list.add(matrix[bottom][k]);
                }
                bottom--;
            }

            if(left<=right){
                for(int l=bottom; l>=top; l--){
                    list.add(matrix[l][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args){
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Return list: "+ sm.spiralOrder(matrix).toString());
    }
}