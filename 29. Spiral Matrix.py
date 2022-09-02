# Time Complexity: O(mxn)
# Space Complexity: O(mxn)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0 or matrix is None:
            return -1
        if len(matrix) == 1: return min(matrix)
        if len(matrix[0]) == 1 and len(matrix) == 1: return matrix[0][0]
        result = []
        left, top = 0, 0
        right = len(matrix[0])-1
        bottom = len(matrix)-1
        while(top <= bottom and left <= right):
            
            # going right
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top += 1
            
            # going down   
            for j in range(top, bottom+1):
                result.append(matrix[j][right])
            right -= 1
            
            # going left
            if top <= bottom:
                for k in range(right, left-1, -1):
                    result.append(matrix[bottom][k])
            bottom -=1
            
            # going up
            if left <= right: 
                for l in range(bottom, top-1, -1):
                    result.append(matrix[l][left])
            left += 1

        
        return result