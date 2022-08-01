# Time Complexity : O(m*n) where m = no of rows of matrix and n = no of columns
# Space Complexity : O(1) or  constant auxiliary space is needed
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction = 1 # Initialize direction to 1 meaning upward
        r = 0 # Initialize row and column to 0 
        c = 0 
        
        m = len(mat)
        n = len(mat[0])
        
        result = [None for x in range(m*n)]
        
        idx = 0 # A counter to find if we reached the end of the matrix
        
        while(idx < len(result)):
            result[idx] = mat[r][c]
            idx += 1
            
            if direction == 1:
                if c == n-1:
                    # IMPORTANT: Check c==n-1 case first, before r==0 as when both c==0 and r==n-1 we need to increase row and not column
                    # If we reached the last column then we cant increment c as it will lead to out of bounds error
                    r+= 1 # Then increase the row and change the direction to downward
                    direction = -1
                elif r==0:
                    c += 1 # If we reached the first row, then we can't decrement r as it will lead to out of bounds. So, we increase c and change direction to downward
                    direction = -1
                else:
                    r -= 1 # In normal non-boundary case, keep decreasing the row i.e go up whuke increasing the column
                    c += 1
            else:
                # When direction is downward. It will be a mirror image of the upward case
                if r == m-1:
                    c+= 1
                    direction = 1
                elif c==0:
                    r += 1
                    direction = 1
                else:
                    r += 1
                    c -= 1
        return result