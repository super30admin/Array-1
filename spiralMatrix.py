# Time Complexity: O(m*n)
# Space Complexity: O(1)

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []
        row = len(matrix)
        col = len(matrix[0])
        top, bottom = 0, row-1
        left, right = 0, col-1
         
        while (top <= bottom and left <= right):
            # moving in east direction
            for i in range (left,right+1):
                res.append(matrix[top][i])
            top += 1

            # moving in south direction
            for i in range (top,bottom+1):
                res.append(matrix[i][right])
            right -= 1

            # moving in west direction
            if (top <= bottom):
                for i in reversed(range (left,right+1)):
                    res.append(matrix[bottom][i])
                bottom -= 1

            # moving in north direction
            if (left <= right):
                for i in reversed(range (top,bottom+1)):
                    res.append(matrix[i][left])
                left += 1

        return res
