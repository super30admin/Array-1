# // Time Complexity : O(M * N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# Keep track of all the boundaries and cross them off one by one as you finish printing that boundary
# Keep track of directions and change them as you finish printing that boundary.
# Print bottom and left row, column in reverse.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        # Edge cases
        if(not matrix or len(matrix)== 0 or len(matrix[0]) == 0):
            return []
        
        # Boundary Elements
        Top = 0
        Bottom = len(matrix) - 1
        Left = 0
        Right = len(matrix[0]) - 1
        direction = 0
        result = []
        
        # While the boundaries are still not the same 
        while(Top <= Bottom and Left <= Right):
            
            # Print top row, go to right column
            if(direction == 0):
                for k in range(Left, Right+1):
                    result.append(matrix[Top][k])
                Top += 1
                direction = 1
                
            # Print right column, go to bottom row
            elif(direction == 1):
                for k in range(Top, Bottom+1):
                    result.append(matrix[k][Right])
                Right -= 1
                direction = 2

            # Print bottom row in reverse, go to left column 
            elif(direction == 2):
                for k in reversed(range(Left, Right+1)):
                    result.append(matrix[Bottom][k])
                Bottom -= 1
                direction = 3
            
            # Print left column in reverse, go to top row (this time it's one step closer to bottom) and repeat.
            elif(direction == 3):
                for k in reversed(range(Top, Bottom+1)):
                    result.append(matrix[k][Left])
                Left += 1
                direction = 0

            # Some error in input, edge case
            else:
                return []
            
            
        return result