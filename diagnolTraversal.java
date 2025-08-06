/**
 * Time Complexity: O(m*n) where m is the number of rows and n is the number of columns in the matrix.
 * Space Complexity: O(1) - output array is not counted
 * Did this program successfully run on Leetcode: Yes
 * Any problem you faced while coding this: No
 */

/** Next element in the upward diagnol is obtained by moving one step up and one step right . However, if we reach the boundary of the matrix while traversing the current diagonal, we need to change direction. 
 *  Next element in the downward diagnol is obtained by moving one step down and one step left. Again, if we reach the boundary of the matrix while traversing the current diagonal, we need to change direction.
 *  The direction variable is used to keep track of the current direction of traversal and change the direction when we reach the boundary. Finally, we store the elements in a result array and return it.
*/

class diagnolTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        int r=0;
        int c=0;
        boolean dir=true;
        int m=mat.length;
        int n=mat[0].length;
        int[] result=new int[m*n];

        for(int i=0;i<=(m*n)-1;i++){
            
            result[i]=mat[r][c];
            if(dir)
            {
                if(r==0&&c!=n-1)
                {
                    c++;
                    dir=false;
                }
                else if(c==n-1)
                {
                    r++;
                    dir=false;
                }
                else
                    {
                         r--;
                         c++;
                    }  
            }
            else
            {
                
                if(c==0&&r!=m-1)
                {
                    r++;
                    dir=true;
                }
                else if(r==m-1)
                {
                    c++;
                    dir=true;
                }
                else
                {
                    r++;
                    c--;
                }
            }
            

        }
        return (result);
        
    }
}