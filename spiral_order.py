# Time Complexity - O(mn)
# Space Complexity - O(1)

class Solution:
    
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        i = 0
        while left<=right and top<=bottom:
            # top row
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top = top+1
            
            # right column
            for j in range(top,bottom+1):
                result.append(matrix[j][right])
            right = right-1
            
            # bottom row
            if top<=bottom:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
            bottom = bottom-1
            
            # left column
            if left<=right:
                for j in range(bottom,top-1,-1):
                    result.append(matrix[j][left])
            left = left+1
        return result
