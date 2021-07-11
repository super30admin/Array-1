// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

public static List<Integer> spiralOrder(int [][] matrix){

    List <Integer> result = new ArrayList<Integer>();
    int m = matrix.length;
    int n = matrix[0].length;

    //Approach is dividing the matrix into 4 parts
    //Left to Right ,top to bottom, right to left , bottom to top
    //initialising
    int top = 0, bottom = m-1, left = 0, right = n-1;

    //right indicates the no of columns, //bottom indictaes the no:of rows
    while(top <= bottom && left <= right) {
        //left to right
        //When you are done traversing the first row (i.e from left to right) you shift the top ++ (Because we dont need the 1st row any more)
        for (int i = left; i <= right; i++) {
            result.add(matrix[top][i]);
        }
        top ++;

        //top to bottom
        //When you are done traversing from new top to bottom ,you shift the current right to right--
        for (int i = top; i <= bottom ; i++) {
            result.add(matrix[i][right]);
        }
        right --;

        //right to left
        //When you are done traversing from right to left ,you shift the bottom -1 (You dnt need the bottom row and shifting to bottom-1)
        if(top <= bottom){
            for (int i = right; i >= left ; i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom --;
        }

        //bottom to top
        if(left <= right){
            for(int i = bottom ; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left ++;
        }

    }
    return result;
}

    public static void main(String args[]){
        int [][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
          List<Integer> result = spiralOrder(nums);
          System.out.println(result.toString());

    }
}

