# Leetcode 238. Product of Array Except Self

# Time Complexity :  O(m*n) where m,n are the rows and columns of the matrix

# Space Complexity : O(1) if result array is not considered else O(m*n)
# where m,n are the rows and columns of the matrix

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Start at the first element in matrix and move towards the right border.
# move to the next row after reaching the end and adjust the top border for next iteration.
# Similarly adjust all borders at the end of every direction. Check if all the elements are traversed
# before starting the traversal in a different direction.
# Keep traversing the array until the result matrix is filled with all the elements.


# Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []

        m = len(matrix)
        n = len(matrix[0])
        result = [None]*(m*n)
        # Positions of direction borders
        left = 0
        right = n-1
        top = 0
        bottom = m-1
        count = 0

        while count < m*n:
            # moving left
            for i in range(left, right+1):
                result[count] = matrix[top][i]
                count += 1
            # adjusting top border
            top += 1
            # moving down
            if count < m*n:
                for i in range(top, bottom+1):
                    result[count] = matrix[i][right]
                    count += 1
                 # adjusting right border
                right -= 1
            # moving right
            if count < m*n:
                for i in range(right, left-1, -1):
                    result[count] = matrix[bottom][i]
                    count += 1
                 # adjusting bottom border
                bottom -= 1
            # moving up
            if count < m*n:
                for i in range(bottom, top-1, -1):
                    result[count] = matrix[i][left]
                    count += 1
                 # adjusting left border
                left += 1
        return result
