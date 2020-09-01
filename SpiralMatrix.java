//Time Complexity: O(n)
//Space complexity: O(n)

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> l =new ArrayList<>();
    public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return l;
        spiral(matrix, 0, matrix[0].length - 1, 0, matrix.length - 1);
        return l;
    }
    
    public static void spiral(int[][] matrix, int left, int right, int top, int bottom){
        if(left > right || top > bottom) 
            return;
        
        //top row
        for(int i=left; i<= right; i++){
            l.add(matrix[top][i]);
        }
        top++;

        //right column
        for(int i=top; i<=bottom; i++){
            l.add(matrix[i][right]);
        }
        right--;

        //bottom row
        if(top <= bottom){
            for(int i=right; i>= left; i--){
                l.add(matrix[bottom][i]);
            }
            
        }
        bottom--;
        //left row
        if(left<=right){
            for(int i=bottom; i>=top; i--){
                l.add(matrix[i][left]);
            }
            
        }
        left++;
        spiral(matrix,left, right, top, bottom); 
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = spiralOrder(mat);
        for(Integer r : res){
            System.out.println(r);
        }
    }
}