# tc : O(mn)
# sc: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        m = len(matrix)
        n = len(matrix[0])
        
        left = 0 
        right = n -1 
        top = 0 
        bottom = m -1 
        result = []
        while(top <= bottom and left<=right ):
            # top row
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            
            # for right top to down 
            if top <= bottom and left<=right :
                for i in range(top, bottom + 1 ):
                    result.append(matrix[i][right])
                right = right -1
            
            # for down most row
            if top <= bottom and left<=right:
                for i in range(right, left -1 , -1):
                    result.append(matrix[bottom][i])
                bottom = bottom - 1
            
            # for left most column
            if top <= bottom and left<=right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left = left + 1
            print(result)
        return result      
            
        