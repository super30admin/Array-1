// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
    //We create indexes at our boundaries and traverse in the order- left to right then top to bottom then right to left and then bottom to top.
    //We repeat this untill any of our index crosses each other.

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0, bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        List<Integer> output= new ArrayList<>();
        
        //left to right
        while(left<=right && top<=bottom){
            for(int x=left;x<=right;x++)
            {
                output.add(matrix[top][x]);
            }
            top+=1;
            //top to bottom
            for(int x=top;x<=bottom;x++)
            {
                output.add(matrix[x][right]);
            }
            right-=1;    
            if(top<=bottom && left<=right){
                      //right to left
                    for(int x= right;x>=left;x--)
                    {
                        output.add(matrix[bottom][x]);
                    }
                        bottom-=1;
                
                    //bottom to top
                    for(int x=bottom;x>=top;x--)
                    {
                        output.add(matrix[x][left]);
                    }
                            left+=1;
                }
        }
        
        return output;
    }
}