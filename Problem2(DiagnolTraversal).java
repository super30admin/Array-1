/*
Leetcode problem: 498
Algorithm:
    1. Create an array of size m*n, while going in the forward direction increment row and decrement column, save the element of the matrix until we hit the boundary. Once the boundary is hit we will go in the backward direction.
    2. While going in backward direction decrement row and increment column until boundary is hit, save each element in result array.
    3. If in forward pass, the col is at the right side of the boundary increment row(down) and if in the backward pass, the row is at the bottom of boundary increment column(right)
    
    Time Complexity: O(m*n)
    Space Complexity: O(1) as only result array is created
    
    Did the solution execute on leetcode? Yes
*/

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix.length==0 || matrix==null)
            return new int[0];
        
        int height = matrix.length;
        int width = matrix[0].length;
        
        int total = height*width;
        int[] result = new int[total];
        int index = 1;
        int row = 0;
        int col = 0;
        result[0]=matrix[0][0];
        boolean forward = true; // initially go in forward direction
        while(index<total){
            if(forward){
            if(col==width-1)
                row++;
            
            else
                col++;
            forward = false;
            while(row<height && col>=0){
                   
                    result[index++]=matrix[row++][col--];
                }
                
                row--;
                col++;
                
            } 
            else{
                if(row==height-1)
                    col++;
                else
                    row++;
                forward =true;
                while(row>=0 && col<width){
                    result[index++] = matrix[row--][col++];
                        }
                
                row++;
                col--;
            }
            }
        
return result;
        }
    }
