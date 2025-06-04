class FindDiagonalOrder {
    /*
    Approach : We maintain the flag for the direction of the diagonal, if the direction is true we go up where row decreases and col increases.
    if the direction is false we go down row increases and column decreases. And we store the final output in result.

    TC: O(m*n) where m is the number of rows in mat and n is the number of columns in mat
    SC: O(1), sinc we are directly storing the element in the result array
    */
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n = mat[0].length;

        int result[]=new int[m*n];
        int r=0;
        int c=0;
        int index=0;
        boolean direction =true;
        while(r>=0 && c>=0 && r<m && c<n){
            result[index]=mat[r][c];
            index++;
            if(direction){
                //Edge case : if c==n-1 should come before r==0 as if the we would be breaching both the top and right we should increment the row
                if(c==n-1){
                    direction = false;
                    r++;
                }
                else if(r==0){
                    direction = false;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                //Edge case : if r==m-1 should come before c==0 as if the we would be breaching both the bottom and left we should increment the row
                if(r==m-1){
                    direction = true;
                    c++;
                }
                else if(c==0){
                    direction = true;
                    r++;
                }
                else{
                    c--;
                    r++;
                }
            }

        }
        return result;
    }
}