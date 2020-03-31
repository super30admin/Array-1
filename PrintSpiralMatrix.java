// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

public class PrintSpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        if(matrix ==null || matrix.length == 0){
            return answer;
        }

        int starti = 0;
        int startj = 0;
        int endi = matrix.length - 1;
        int endj = matrix[0].length - 1;

        while(starti <= endi && startj <= endj){

            // Traverse right
            for(int c = startj; c <= endj; c++){
                answer.add(matrix[starti][c]);
            }

            starti++;

            // Traverse down
            for(int r = starti; r <= endi; r++){
                answer.add(matrix[r][endj]);
            }

            endj--;

            if(starti <= endi){
                // Traverse left
                for(int c = endj; c >= startj ; c--){
                    answer.add(matrix[endi][c]);
                }
            }

            endi--;

            if(startj <= endj){
                //Traverse up
                for(int r = endi; r >= starti; r--){
                    answer.add(matrix[r][startj]);
                }
            }

            startj++;
        }

        return answer;
    }

    public static void main(String args[]){
        int[][] nums = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(nums));
    }
}
