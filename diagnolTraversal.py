#// Time Complexity :  O(len(rows)*len(columns)) due to diagonal Traversal
#// Space Complexity : O(rowlength*columnlength) due to diagTraversal matrix
#// Did this code successfully run on Leetcode : YES
#// Three line explanation of solution in plain english
    # Iterate from row=0 and col = 0 
    # Based on the direction (up/down) we update the row and column
    # Also check the edge cases as the row and col cannot exceed the matrix length and cant go less than 0.
    
#// Your code here along with comments explaining your approach
def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = 0
        col = 0
        i = 0;
        # up - 1 -->
        # down - 0 <--
        direction =  1
        
        #len(mat[0]) : number of columns
        #len(mat) : number of rows
        
        diagTraversal = []* len(mat)*len(mat[0])
        
        # populate the diagTraversal
        while (i < len(mat[0]) * len(mat)):
            
            # add the element into result
            diagTraversal.append(mat[row][col])
            i = i + 1;
            
            # up
            if direction == 1:
                # last column in upward direction
                if col == len(mat[0]) - 1 :
                    direction = 0;
                    row =  row + 1
                    
                # first row ending condition
                elif row == 0:
                    col = col + 1
                    direction = 0
                    
                # default case
                else:
                    row = row - 1;
                    col = col + 1;
            
            # down
            else:
                # last row in downward direction
                if row == len(mat)- 1 :
                    direction = 1;
                    col =  col + 1

                # first row ending condition
                elif col == 0:
                    direction  = 1
                    row = row + 1

                # default case
                else:
                    row = row + 1;
                    col = col -1;
                    
         
        return diagTraversal