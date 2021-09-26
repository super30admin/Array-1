class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # TC O(mn)
        # SCO(1)
        if matrix is None or len(matrix) == 0:
            return []
        m =  len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m -1
        right = n -1
        left= 0
        result = []
        while(top <= bottom and left <= right):
            
            # Move left to right
            for i in range(left, right+1 ):
                result.append(matrix[top][i])
            top += 1
            
            # Move top to bottom
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            if top <= bottom:
                # Move right to left
                for i in range( right,left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            if left <= right:
                
                # Move bottom to top
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
            
        return result
                
        
