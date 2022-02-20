// space complexity - o(1)
    //time - o(m*n)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : if given start cell indices, write two functions to moeve up and down the diagonal and return the end cell indices wehre traversal stops
    // now based on the last traversal stop cell , we need to calculate next start cell indices

class Solution {

    int[] res;
    int n;
    int m;
    int index ;

    public int[] findDiagonalOrder(int[][] mat) {

        n = mat.length;
        m = mat[0].length;
        res = new int[n*m];
        index = 0;

        boolean up = true;

        int x = 0;
        int y = 0;

        while(index < m*n){

            if(up){
                up = false;
                int[] arr = moveUp(mat, x,y);

                if(arr[0] == 0 && arr[1] < m-1){
                    x = arr[0];
                    y = arr[1] +1;
                }
                else{
                    x = arr[0] +1;
                    y = arr[1];
                }
            }
            else{
               up = true;
               int[] arr = moveDown(mat, x,y);
                if(arr[0] < n-1 && arr[1] == 0){
                    x = arr[0]+1;
                    y = arr[1] ;
                }
                else{
                    x = arr[0];
                    y = arr[1] + 1;
                }

            }
        }

        return res;
    }


    public int[] moveUp(int[][] mat, int x, int y){
        while(x>=0 && y>=0 && x<n && y<m){
            res[index++] = mat[x][y];
            x--;
            y++;
        }
        return new int[]{++x, --y };
    }

    public int[] moveDown(int[][] mat, int x, int y){
        while(x>=0 && y>=0 && x<n && y<m){
            res[index++] = mat[x][y];
            x++;
            y--;
        }
        return new int[]{--x, ++y };
    }

}
