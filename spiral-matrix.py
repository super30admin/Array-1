class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        if not matrix:
            return []
        
        top = 0
        right = len(matrix[0]) - 1
        bottom = len(matrix) - 1
        left = 0
        dir = 0
        
        
        while left <= right and top <= bottom:
            if dir == 0:
                for i in range(left, right+1):
                    result.append(matrix[top][i])
                top += 1
                dir = 1
            elif dir == 1:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
                dir = 2
            elif dir == 2:
                for i in reversed(range(left, right+1)):
                    result.append(matrix[bottom][i])
                bottom -= 1
                dir = 3
            elif dir == 3:
                for i in reversed(range(top, bottom+1)):
                    result.append(matrix[i][left])
                left += 1
                dir = 0
                    
        return result