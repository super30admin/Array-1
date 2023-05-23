import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {


        public List<Integer> spiralOrder(int[][] matrix) {

            int m = matrix.length, n = matrix[0].length;
            List<Integer> result = new ArrayList<>(); // Space: O(1) as it is given in problem

            // if(m == 0) return result;

            int top = 0, bot = m-1;
            int left = 0, right = n-1;

            while(top <= bot && left <= right){ // Time: O(m*n)

                // top row
                for(int j = left; j<= right;j ++){
                    result.add(matrix[top][j]);
                }
                top++;

                // right column
                //if(top <= bot && left <= right){

                for(int i = top; i <= bot; i++){
                    result.add(matrix[i][right]);
                }
                // }
                right--;

                // bottom row
                if(top <= bot){ //&& left <= right
                    for(int j= right; j >= left; j-- ){
                        result.add(matrix[bot][j]);
                    }
                }
                bot--;

                // left column
                if(left <= right) { // &&top <= bot
                    for(int i = bot; i >= top; i--){
                        result.add(matrix[i][left]);
                    }
                }
                left++;
            }

            return result;
        }

        public static void main(String[] args){

            SpiralMatrix object = new SpiralMatrix();

            int[][] arrayInput = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

            List<Integer> answer = object.spiralOrder(arrayInput);

            System.out.println(" Elements of matrix in Spiral order: "+ Arrays.toString(List.of(answer).toArray()));

        }


}

// recursive
/*
class Solution {

    List<Integer> result = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        if(m == 0) return result;

        int top = 0, bot = m-1;
        int left = 0, right = n-1;

        dfs(matrix, top, bot, left, right);

        return result;
    }

    public void dfs(int[][] matrix, int left, int right, int top, int bot){

        //base
        if(left > right || top > bot) return;

        // top row
        for(int j = left; j<= right;j ++){
            result.add(matrix[top][j]);
        }
        top++;

        // right column
        //if(top <= bot && left <= right){ }

        for(int i = top; i <= bot; i++){
            result.add(matrix[i][right]);
        }
        right--;

        // bottom row
        if(top <= bot){ //&& left <= right
            for(int j= right; j >= left; j-- ){
                result.add(matrix[bot][j]);
            }
        }
        bot--;

        // left column
        if(left <= right) { // &&top <= bot
            for(int i = bot; i >= top; i--){
                result.add(matrix[i][left]);
            }
        }
        left++;

        dfs(matrix, left, right, top, bot);
    }
}*/