// Time Complexity :o(m*n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach: took 4 variables top,bottom,left right and assignrd the values when ever the values reach the n-1 we increament and change the direction
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        List<Integer> result=new ArrayList<>();
        int n=matrix[0].length;
        int left=0;int right=n-1;
        int top=0;int bottom=m-1;
        int i,j;
        while(top<=bottom && left<=right){
            for(j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            for(i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){for(j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;}
           if(left<=right) {for(i=bottom;i>=top;i--){
                 result.add(matrix[i][left]);
            }
            left++;}
        }
        return result;
    }
}