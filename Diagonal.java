//approach-whenever we are traversing a matrix we have to observe the change in the direction. here since the change in the direction is only two directions. I'm using a Boolean variable to track the next direction of the traversal.  here when traversing the diagonals upward the two edge cases are being Having a column right next to the cell we stopped at and not having a column next to the cell we stopped at.  when we are  traversing the diagonals downward the 2 edge cases are being we have a row next to the cell we stopped in and not having a row.  using the loop variables we are efficiently handling the 4-edge cases. 
//time complexity-O(m x n) since we are tranversing the entire matrix.
// space complexity-O(1) as the only extra space is for the variables which would be O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [] result=new int[m*n];
        int size=0;
        boolean dir=true;
        int r=0,c=0;

        while(r<m&&c<n){
            //transvering the diagonal upwards till there is no element left
            if(dir){
            result[size++]=mat[r][c];
            if(r==0&&c!=n-1){
                dir=false;
                c++;
                
            }
            else if(c==n-1){
                dir=false;
                r++;
                
            }else{
            r--;
            c++;
            }

            }else{////transvering the diagonal downwards till there is no element left
            result[size++]=mat[r][c];
            if(c==0&&r!=m-1){
                dir=true;
                r++;
                
            }else if(r==m-1){
                dir=true;
                c++;
                
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
