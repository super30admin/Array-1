# Time complexity: O(n*m)
# Space complexity: O(1) since output array is required

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if matrix is None or len(matrix) == 0 or len(matrix[0]) == 0:
            return []
        n = len(matrix)
        m = len(matrix[0])
        output = [0 for i in range(m*n)]
        index = 0 # to iterate through output
        
        i = 0
        j = 0
        dirs = 1
        
        while index < (n*m):
            output[index] = matrix[i][j]
            index = index + 1
            
            if dirs == 1:
                if j == m - 1:
                    i = i + 1
                    dirs = -1 # Direction: downwards
                elif i == 0:
                        j = j + 1
                        dirs = -1
                else:
                    i = i - 1
                    j = j + 1
            else:
                if i == n - 1:
                    j = j + 1
                    dirs = 1 # Direction: upwards
                elif j == 0:
                        i = i + 1
                        dirs = 1
                else:
                    i = i + 1
                    j = j - 1
        return output