// Time Complexity :O(m*n) --> the while and for loops combined will run a total of m*n times(total elements in the matrix);
// Space Complexity :O(m*n) --> because of the output array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Since there can be only two main ways of traversing : going top right or bottom left , we can see that for elements with odd positions
// the pattern will be bottom left and even positioned elements it is top right.
// Check for edge cases
// while going top right : if its top row and last column go to the bottom row and same column and follow bottom left pattern
//                          else if its top row and not last column go to next column same row and follow bottom left
//                            else follow bottom left
// while going bottom left : if its first column and last row go to next column and same row and follow top right
//                            else if its first column and not last row go to next row and follow top right
//                              else follow top right.

public class zigzagPattern {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0)
            return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        int r=0,c=0;
        int[] result = new int[m*n];
        for(int i = 0;i<m*n;i++){
            result[i] = matrix[r][c];
            if((r+c)%2==0){
                if(c==n-1) r++;
                else if(r==0) c++;
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1) c++;
                else if(c==0) r++;
                else{
                    c--;
                    r++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3 },
                { 4,5,6 },
                { 7,8,9 } };
        int[] result = findDiagonalOrder(nums);
        for(int i = 0;i<result.length;i++)
            System.out.println(result[i]);
    }
}
