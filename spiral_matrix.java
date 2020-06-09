// Time Complexity :O(m*n) m-length of rows n-length of columns
// Space Complexity :O(1) As the list is returned it is not an axillary space
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this : -
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list=new ArrayList<>();
        
        if(matrix==null || matrix.length==0) 
            return list;
        
        int m=matrix.length , n=matrix[0].length;
        
        int left=0 , top=0 , right=n-1 , bottom=m-1;
        
        while(left<=right && top<=bottom)
        {
          for(int i=left;i<=right;i++){
              list.add(matrix[top][i]);
          }
          top++;
          for(int i=top;i<=bottom;i++){
             list.add(matrix[i][right]);
          }
          right--;
          if(top<=bottom)
          for(int i=right;i>=left;i--){
             list.add(matrix[bottom][i]);
          }
          bottom--;
          if(left<=right)
          for(int i=bottom;i>=top;i--){
             list.add(matrix[i][left]);
          }
          left++;
        }
        
        return list;
    }
}
//Recursion
/*
class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
    
        if(matrix==null || matrix.length==0) 
            return list;
        
        int m=matrix.length , n=matrix[0].length;
        
        int left=0 , top=0 , right=n-1 , bottom=m-1;
        
        recursive(matrix,top,bottom,left,right);
        return list;
    }
    
    private void recursive(int matrix[][],int top,int bottom,int left,int right)
    {
        if(left>right || top>bottom)
            return;
          for(int i=left;i<=right;i++){
              list.add(matrix[top][i]);
          }
          top++;
          for(int i=top;i<=bottom;i++){
             list.add(matrix[i][right]);
          }
          right--;
          if(top<=bottom)
          for(int i=right;i>=left;i--){
             list.add(matrix[bottom][i]);
          }
          bottom--;
          if(left<=right)
          for(int i=bottom;i>=top;i--){
             list.add(matrix[i][left]);
          }
          left++;
        recursive(matrix,top,bottom,left,right);
    }
}
*/