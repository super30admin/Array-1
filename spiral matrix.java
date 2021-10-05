// Time Complexity :o(n^2)
// Space Complexity :0(n) for arraylist.
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :yes,sometimes out of bound errors and sometimes wrog output.


// Your code here along with comments explaining your approach:-taking four pointers left,right,top and bottom for left tranversal adding to list until left dummy variable reaches right,next for right column decrementing top dummy variable till bottom. and doing reverse for remaining two coloumns.








class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        ArrayList<Integer> a=new ArrayList<>();
        while((left<=right)&&(top<=bottom)){
            for(int i=left;i<=right;i++){
                a.add(matrix[top][i]);
            }
            top++;
            for(int v=top;v<=bottom;v++){
                a.add(matrix[v][right]);
            }
            right--;
            if((top<=bottom)&&(left<=right)){
                for(int u=right;u>=left;u--){
                    a.add(matrix[bottom][u]);
            }
                 bottom--;
                for(int h=bottom;h>=top;h--){
                    a.add(matrix[h][left]);
                
            }
                 left++;
        }
        }
        
return a;}
}
