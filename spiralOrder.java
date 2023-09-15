import java.util.ArrayList;
import java.util.List;

class spiralOrder {
    public List<Integer> spiral0rder(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return new ArrayList<>();
        }
        List<Integer>result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        int top =0, bottom = m-1;
        int left=0, right = n-1;

        while(top<=bottom && left<=right){
            //Move and capture all elements from left to right
            for(int i = left; i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //Move and capture all elements from right to left
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //Move and capture all elements from right to left
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }
            //Move and capture all elements from bottom to top
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


// and a if condition and run but thats actually not needed so removed brute force method i added 
// if(top<=bottom &&left<=right) before every for loop.