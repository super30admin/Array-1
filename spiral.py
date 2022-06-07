# Time Complexity: O(m*n)
# Space Complexity: O(1)
  
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m = len(matrix)
        n = len(matrix[0])
        res = list()
        
        left = 0
        right = n-1
        top = 0
        bottom = m-1
        
        while left <= right and top <= bottom:
            #Top row
            
            for j in range(left, right+1):
                res.append(matrix[top][j])
            
            top += 1
            #Right col

            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right -= 1
            #bottom row
            if top <= bottom:
                for j in range(right, left-1, -1):
                    res.append(matrix[bottom][j])
            bottom -= 1
            #left col
            if left <= right:
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
            left += 1
            
        return res
                
        
