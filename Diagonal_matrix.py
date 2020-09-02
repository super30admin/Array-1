// Time Complexity :O(r*c) r- rows, c- cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: mainly checking for three possible cases. first going up in the matrix, second going down in the matrix, and third when to 
change directions to move upward or downward. in all the cases we need to move our pointers(rows and columns) accordingly.

// Your code here along with comments explaining your approach: using two pointers(rows and cols) and traversing every element in the matrix 


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return []
        
        row = 0
        col = 0
        result = []
        direction = True
        
        for i in range(0, len(matrix)*len(matrix[0])):
            result.append(matrix[row][col])
            
            if direction:
                
                if col == len(matrix[0])-1:
                    row += 1
                    direction = False
                
                elif row == 0:
                    col += 1
                    direction  = False
                
                else:
                    row -= 1
                    col += 1
            
            
            else:
                
                if row == len(matrix)-1:
                    col += 1
                    direction = True
                
                elif col == 0:
                    row += 1
                    direction = True
                
                else:
                    row += 1
                    col -= 1
        
        return result
