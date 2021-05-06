# time complexity : O(mn)
#space complexity : o(1)
class Solution(object):
    def spiralOrder(self, matrix):
        
        result = []
        
        m = len(matrix)
        if m ==  0:
            return result
        n = len(matrix[0])
        
        top = 0
        bottom = m
        left = 0
        right = n
        
        size = m*n
        
        while len(result) < size:
        
            
            for i in range(left ,right+1):
                    result.append(matrix[top][i])
            
            top = top +1
            
            for i in range(top,bottom+1):
                   result.append(matrix[i][right])
            
            right = right - 1
            
            
            
            for i in range(right,left, -1):
                    result.append(matrix[bottom][i])
            
            bottom = bottom - 1
            
            for i in range(bottom,top,-1):
                    result.append(matrix[i][left])
            
            left = left + 1
            