    
    # 54. Spiral Matrix
    #  Time Complexity : O(n*m)
    #  Space Complexity : O(1) 
    
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        
        left = top = 0
        right = len(matrix[0])
        bottom = len(matrix)
        
        m = len(matrix)
        n = len(matrix[0])
        arr = []

        while len(arr) < m*n:

            for i in range(left,right):
                arr.append(matrix[top][i])

            for j in range(top+1, bottom):
                arr.append(matrix[j][right-1])

            if top < bottom-1:
                for i in range(right-2, left-1, -1):
                    arr.append(matrix[bottom-1][i])

            if left < right-1:
                for j in range(bottom-2, top, -1):
                    arr.append(matrix[j][left])

            left += 1
            top += 1
            right -= 1
            bottom -= 1

        return arr   