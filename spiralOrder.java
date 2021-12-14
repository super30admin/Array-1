// Time Complexity :O(m+n), traversing each element exactly once.
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
/* Approach- here we have taken two pointers top and bottom for running through the elements from row 1 to
 row m and, pointers left and right from column 1 to column n*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l=new ArrayList<>();
       int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                l.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--)
                    l.add(matrix[bottom][j]);
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    l.add(matrix[i][left]);
            }
            left++;

        }
       return l;
    }
}