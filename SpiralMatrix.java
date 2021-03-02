// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// In this approach we simply we use four pointers as top ,bottom , left adn right.
// We keep making the matrix smaller using these pointers avoiding putting elements that we have already put in the resul array.


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      
      List<Integer> result = new ArrayList<>();
      if(matrix == null || matrix.length ==0)
        return result;
      
      int m = matrix.length;
      int n = matrix[0].length;
      int top = 0;
      int bottom = m-1;
      int left = 0;
      int right = n-1;
      
      while(top<= bottom && left <= right)
      {
    	//going left to right
        for(int j = left; j<= right;j++)
        {
          result.add(matrix[top][j]);
        }
        top++;
        
      //going right to bottom
        if(top<= bottom && left <= right)
        {
          for(int i = top ; i<= bottom ;i++)
          {
            result.add(matrix[i][right]);
          }
        }
        right--;
          
        //going bottom to left
          if(top<= bottom && left <= right)
          {
            for(int i = right;i>= left ;i--)
            {
              result.add(matrix[bottom][i]);
            }
          }
          bottom--;
          
          //going bottom to top
          if(top<= bottom && left <= right)
          {
            for(int i = bottom;i>= top ;i--)
            {
              result.add(matrix[i][left]);
            }
          }
          left++;
      }
      return result;
        
    }
}