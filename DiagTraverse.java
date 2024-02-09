// Time Complexity : O(m*n)
// Space Complexity : O(1) , we dont count output in space complexity
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Divide the problem into smaller parts and find the edge cases. Then decide the direction and row and col values

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; //row
        int n = mat[0].length; //column
        int[] result = new int[m*n];
        int r = 0 ; int c = 0;
        Boolean dir = true; // UP - True & Down --> False

        for( int i = 0 ; i < m*n ; i++){
            // System.out.println("row: " + r);
            // System.out.println("col: " + c);
            result[i] = mat[r][c];
            //up direction
            if(dir){
                if(c == n-1){ // boundary conditions
                    r++;
                    dir = false;

                }else if(r == 0){ // boundary conditions
                    c++;
                    dir = false;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{ //down
                if(c == 0 && r != m-1){ // boundary conditions
                    r++;
                    dir = true;
                }
                else if(r == m-1){ // boundary conditions
                    c++;
                    dir = true;
                }
                else{
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}