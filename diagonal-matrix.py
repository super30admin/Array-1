# Time Complexity: O(m*n)
# Space Complexity: O(1)
# Did this run on Leetcode: Yes
# Approach:
# Use pointers to keep track of martix indices and direction
# Increment/decrement the pointers based on the direction of traversal
# Flip the direction at the boundaries - first row/last column
 
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix or len(matrix) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = [0]*(m*n)
        i, j, idx = 0,0,0
        dir = 1
        
        while(idx < m*n):
            result[idx] = matrix[i][j]
            if dir == 1:
                if j == n - 1:
                    i += 1
                    dir = -1
                elif i == 0:
                    j += 1
                    dir = -1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m - 1:
                    j += 1
                    dir = 1
                elif j == 0:
                    i += 1
                    dir = 1
                else:
                    j -= 1
                    i += 1
            idx += 1
            
        return result