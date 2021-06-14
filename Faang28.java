package leetcode;

//time complexity =O(M*N)
//space complexity=O(m*n)

import java.util.ArrayList;
import java.util.List;

class Faang28 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int m=matrix.length; int n=matrix[0].length;
        int top=0;int bottom=m-1;
        int left=0;int right=n-1;
        while(top<=bottom && left<=right){
            //top row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //right column
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //last row
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //leftcolumn
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
}