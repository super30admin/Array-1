/*
Time Complexity : O(m*n)
Space Complexity : O(m*n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/

public class DiagonalTraverse {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int [] result = new int[m*n];
            int up =1;
            int down = -1;
            int i = 0, j =0;
            int direction = 1;
            int count = 0;
            
            while(count < m*n){
                    result[count] = mat[i][j];
                    if( direction == up){ //up. --> i-- j++
                        if(j == n-1){ // this condition has to be checked first since we want 3 to go down
                            i++;
                            direction = down;
                        }
                        else if(i == 0){
                            j++;
                            direction = down;
                        }
                        else {
                            i--;
                            j++;
                        }
                    }
                    else{ //down.   -> i++ j--
                        if (i == m-1){ //execute this first since we want 13 to go up for a 4x4
                            j++; 
                            direction = up;
                        }
                        else if( j == 0){
                            i++;
                            direction = up;
                        }
                        else {
                            i++;
                            j--;
                        }
                    }
                    count++;
                }
            return result;
        }
    }
