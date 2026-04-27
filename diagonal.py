# Time Complexity : O(m*n)
# Space complexity :O(1) auxiliary space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# using a boolean flag to track whether the current movement is diagonally upward or downward.
# In upward movement steps up-right but if it hits the top edge it shifts right, or if it hits the right edge it shifts down, and flips the direction flag to downward.
# In downward movement steps down-left but if it hits the left edge it shifts down, or if it hits the bottom edge it shifts right, and flips the direction flag back to upward.

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0])
        #True -> moving up
        #False ->moving down
        direction = True
        output = [0] * m * n
        r,c = 0,0

        for i in range(0,len(output)):
            output[i] = mat[r][c]
            #moving up
            if direction == True:
                if r == 0 and c != n-1:
                    c += 1
                    direction = False
                #right edge 
                elif c == n-1:
                    r += 1
                    direction = False
                else:
                    r -= 1
                    c += 1
            # moving down
            else:
                
                if c == 0 and r != m -1:
                    r += 1
                    direction = True
                #left edge
                elif r == m-1:
                    c += 1
                    direction = True
                else:
                    c -= 1
                    r += 1
        return output