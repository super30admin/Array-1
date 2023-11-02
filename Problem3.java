// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


import java.util.*;


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output= new ArrayList<>();
        int m= matrix.length;
        int n= matrix[0].length;
        int R1=0,R2=m,C1=-1,C2=n;
        int i=0,j=0;

        // Loop until we have covered all numbers
        while(output.size()<m*n){
            //Move right on R1
            while(j<C2){
                output.add(matrix[i][j]);
                j++;
            }
            // Move left down and decrement C2
            j--;
            C2--;
            i++;
            //Move down on C2
            while(i<R2){
                output.add(matrix[i][j]);
                i++;
            }
            //Move left up and decrement R2
            i--;
            R2--;
            j--;
            //check again if R1 and R2 collided if not proceed
            if(R1<R2){
                //Move left on R2
                while(j>C1){
                    output.add(matrix[i][j]);
                    j--;
                }
                //Move right up and increment C1
                j++;
                C1++;
                i--;
            }
            //check again if C1 and C2 collided if not proceed.
            if(C1<C2){
                //Move up on C1
                while(i>R1){
                    output.add(matrix[i][j]);
                    i--;
                }
                //Move right down and increment R1
                i++;
                R1++;
                j++;
            }
        }
        return output;
        
    }
}