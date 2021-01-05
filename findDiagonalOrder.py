# Time Complexity : O(N) number of elements in matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Sort of... thought of different ways I could go about this.
# such as thinking of it as one array and finding patterns for diagonals


# Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        """ 
        Initial Thoughts: 
            - need to put vals in resArr..
            - can think of it in one array? like that one binarySearch question..Nah
            
            - direction up-right:
                - nextRow = row-1
                - nextCol = col+1
            - direction bottom-left:
                - nextRow = row+1
                - nextCol = col-1
        
        direction = 1
            - nextRow = row-direction
            - nextCol = col+direction
        direction =- 1 
            - nextRow = row-direction
            - nextCol = col+direction
    
        when we hit a wall.. 
            d = 1 can't go right we go down
            d =-1 can't go down we go right    
        """
        res = []
        if not matrix:
            return res
        row = 0 
        col = 0 
        direction = 1
        
        while len(res) != (len(matrix)*len(matrix[0])):
            res.append(matrix[row][col])
            nextRow = row - direction
            nextCol = col + direction 
            #watch for walls 
            if (nextRow < 0 or nextRow == len(matrix) or nextCol < 0 or nextCol == len(matrix[0])):
                if direction == 1:
                    if nextCol == len(matrix[0]):
                        row += 1
                    else:
                        col += 1
                else:
                    if nextRow == len(matrix):
                        col += 1
                    else:
                        row += 1
                #need to change direction
                direction *= -1
            else:
                row = nextRow
                col = nextCol
                
        return res