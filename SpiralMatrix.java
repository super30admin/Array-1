// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : maintain limits top, bottom, left and right. Increment and decrement them accordingly after each "step". Print the elements. Handle edge cases after initial solution in place.

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> output = new ArrayList<Integer>();

        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        int i = 0;
        int j = 0;

        while(top <= bottom && left <= right) {

            //Step 1
            while(j <= right) {
                output.add(matrix[i][j]);
                j++;
            }
            j = j - 1;
            top = top + 1;
            i = i + 1;

            if( top <= bottom ) {

                // Step 2
                while(i <= bottom) {
                    output.add(matrix[i][j]);
                    i++;
                }
                i = i - 1;
                right = right - 1;
                j = j - 1;
    
                if( left <= right) {
                    // Step 3
                    while( j >= left) {
                        output.add(matrix[i][j]);
                        j--;
                    }
                    j = j + 1;
                    bottom = bottom - 1;
                    i = i - 1;
        
                    // Step 4
                    while( i >= top ) {
                        output.add(matrix[i][j]);
                        i--;
                    }
                    i = i + 1;
                    left = left + 1;
                    j++;
                }

                
            }

            

        }

        return output;
    }

    public static void main(String args[]) {
        List<Integer> result = spiralOrder(new int[][]{{7}, {9}, {6}});

        for(Integer i : result) {
            System.out.println(i);
        }
    }
}