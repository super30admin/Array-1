// Time Complexity: O(m *n) . It is linear w.r.t input size since the input size is also m*n;
//Space Complexity: O(1) . Since we are not using any extra space.
// Problem : Leetcode #54. Spiral Matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<Integer>();
        
        if( matrix==null || matrix.length==0 )
            return result;
        
        int m=matrix.length, n=matrix[0].length;
        // Create four boarder pointers lt, rt, top, bottom to indicate the boundary of all the inner spiral
        int lt=0, rt=n-1, top=0, bottom=m-1;
        
        while( lt<= rt && top <=bottom)
        {
            // Note: Since we are modifying lt, rt, top, bottom with in the while loop, we need to check and make sure that this condition is valid and consistent through out the while block
            
            // Check while condition: Not required since we are not changing the parameters before the for and after the entry into while loop
            // move from left to right
              for(int i=lt; i<=rt; i++)
              {
                  result.add(matrix[top][i]);
              }
            top++;
            
            
            // Check while condition: No need to check. Since the only parameter changed so far in the while condition is 'top' and the condition('top <=bottom'), we are already checking in for loop
            // move from top to bottom
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][rt]);
            }
            rt--;
            
            // Check while condition: we have to check the condition wrt top & bottom . Since condition wrt lt & rt is already covered by for loop
            // move from right to left
            if(top<=bottom)
            {
               for(int i=rt; i>=lt; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
                
           
            // Check while condition: we have to check the condition wrt lt & rt. Since condition wrt  is already top & bottom covered by for loop
            // move from bottom to top
            if(lt<=rt)
            {
                 for(int i=bottom; i>=top; i--)
                {
                    result.add(matrix[i][lt]);
                }
                lt++; 
            }
            
        }
        
        return result;
        
    }
}