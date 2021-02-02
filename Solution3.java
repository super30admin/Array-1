// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english
Iterate on each element in up down fashion. Apply rules when exceeds border

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix.length==0 || matrix[0].length==0)
            return new int[]{};

        int dx[] = {-1,+1};
        int dy[] = {+1,-1};
        int R = matrix.length;
        int C = matrix[0].length;

        int dir = 0; //direction

        int x=0;
        int y=0;

        int N = matrix.length*matrix[0].length;
        int result[] = new int[N];

        for(int i=0;i<N;i++){

            result[i] = matrix[x][y];

            x += dx[dir%2];
            y += dy[dir%2];

            if(x>=R){ //first condition is exceeds upper limit because we diagonal is in top down fashion
                y +=2;
                x--;
                dir++;
            }

            if(y>=C){ //first condition is exceeds upper limit because we diagonal is in top down fashion
                x += 2;
                y--;
                dir++;
            }

            if(x<0){
                x++;
                dir++;
            }

            if(y<0){
                y++;
                dir++;
            }
        }

        return result;
    }
}