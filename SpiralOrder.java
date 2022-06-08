// Time Complexity : O(m*n) where m and n are rows and columns respectively
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Maintaining 4 variables which tells us the outer box to traverse

import java.util.*;

class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i=0;
        int firstrow=0, lastcolumn=matrix[i].length-1, lastrow=matrix.length-1, firstcolumn=0;
        //int visited[matrix.size()][matrix[i].size()] = {0};
        List<Integer> output = new ArrayList<>();
        while(output.size()!=matrix.length*matrix[i].length){
            //cout<<output.size()<<endl;
            for(int k=0;k<matrix[i].length;k++){
                if(matrix[firstrow][k]!=101){
                    output.add(matrix[firstrow][k]);
                    matrix[firstrow][k]=101;
                }
            }
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][lastcolumn]!=101){
                    output.add(matrix[k][lastcolumn]);
                    matrix[k][lastcolumn]=101;
                }
            }
            for(int k=matrix[i].length-1;k>=0;k--){
                if(matrix[lastrow][k]!=101){
                    output.add(matrix[lastrow][k]);
                    matrix[lastrow][k]=101;
                }
            }
            for(int k=matrix.length-1;k>=0;k--){
                if(matrix[k][firstcolumn]!=101){
                    output.add(matrix[k][firstcolumn]);
                    matrix[k][firstcolumn]=101;
                }
            }
            firstrow++;
            firstcolumn++;
            lastrow--;
            lastcolumn--;
        }

        return output;
    }

    public static void main(String [] args){
        int [][] matrix = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        SpiralOrder s = new SpiralOrder();
        System.out.println((s.spiralOrder(matrix)));
    }
}