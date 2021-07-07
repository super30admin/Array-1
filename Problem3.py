class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == [] or len(matrix) == 0:
            return []
        
        result = []
        
        m = len(matrix)
        n = len(matrix[0])
        
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        
        #left to right
        for i in range(left,right):
            result.append(matrix)
        top += 1
        
        #top to bottom
        for i in range(top,bottom):
            result.append(matrix[i][right])
        right -= 1
        
        #right to left
        for i in range(right,left):
            result.append(matrix[bottom][i])
        bottom-=1
        
        #bottom to top
        for i in range(bottom,top):
            result.append(matrix[i][left])
        left+=1
        
        return result
