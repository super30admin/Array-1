# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 

#Have a direction flag to change the workflow and check for boundary conditions. Rest is just changing row and column index

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if matrix == None or len(matrix) == 0 or len(matrix[0]) == 0:
            return []
        
        m,n = len(matrix), len(matrix[0])
        dirs = 1
        ans = [0 for _ in range(m*n)]
        index, i, j = 0, 0, 0
        
        while index < m*n:
            ans[index] = matrix[i][j]
            index += 1
            
            if dirs == 1:
                if j == n - 1:
                    dirs = -1
                    i += 1
                elif i == 0:
                    dirs = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m - 1:
                    dirs = 1
                    j += 1
                elif j == 0:
                    dirs = 1
                    i += 1
                else:
                    j -= 1
                    i += 1
        return ans
