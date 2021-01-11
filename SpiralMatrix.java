//Time complexity : O(m*n)
//Space complexity : O(m*n)
package ThirdWeek;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
int top = 0;
int bottom = matrix.length-1;
int left =0;
int right= matrix[0].length-1;


while(top <= bottom && left<=right){

    // Top row

    for(int i=left;i<=right;i++){
        result.add(matrix[top][i]);
    }
    top++;

    // right column

    for(int i=top;i<=bottom;i++){
        result.add(matrix[i][right]);
    }
    right --;

    // bottom row

    if(top <= bottom){
        for(int i=right;i>=left;i--){
            result.add(matrix[bottom][i]);
        }
        bottom --;
    }


    // left column
    if(left<=right){
        for( int i=bottom;i>=top;i--){
            result.add(matrix[i][left]);
        }
        left++;
    }

}
        return result;
    }


    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 2, 3}, {4, 5, 6 }, { 7, 8, 9 }  };
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result.toString());
       // print(spiralOrder(matrix));
    }

}
