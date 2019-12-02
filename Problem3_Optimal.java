/**
LeetCode Submitted : YES
Runtime Complexity : O(N)
Space Complexity : O(N)

Traverse each direction in matrix and accordingly increase pointers so that it changes directions when it is required
**/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //Boundary Condition
        if(matrix == null || matrix.length < 1)
            return new ArrayList();
        
        //Intialize the directions of the spiral movement
        int top    = 0;
        int left   = 0;
        int bottom = matrix.length - 1;
        int right  = matrix[0].length - 1;
        
        //Output to Store the results
        List<Integer> out = new ArrayList<>();
        
        //Intial direction which is right from top
        int dir = 1;
        
        while(top<= bottom && right >= left){
            
            //Traverse right from TOP of the matrix
            if(dir == 1){
                    int tempLeft = left;
                    while(top <= bottom && right >= left){
                        out.add(matrix[top][left]);
                        //top++;
                        left ++;
                    }
                top = top + 1;
                left = tempLeft;
                dir = 2;
            }
            //Second Direction which is Top to Bottom
            else if(dir == 2){
                   int tempTop = top;
                    while(top <= bottom && right >= left){
                        out.add(matrix[top][right]);
                        top++;
                    }
                right = right - 1;
                top   = tempTop;
                dir   = 3;
            }
            
            //Third Direction which is Left to Right
            else if(dir == 3){
                    int tempRight = right;
                    while(top <= bottom && right >= left){
                        out.add(matrix[bottom][right]);
                        right --;
                    }
                
                bottom  = bottom - 1;
                right   = tempRight;
                dir     = 4;
            }
            
            //Third Direction which is Bottom to Top
            else{
                int tempBottom = bottom;
                    while(top <= bottom && right >= left){
                        out.add(matrix[bottom][left]);
                        bottom --;
                    }
                
                left  = left + 1;
                bottom   = tempBottom;
                dir     = 1;
            }
            
            
            
            
        }
        
        return out;
        
    }
}
