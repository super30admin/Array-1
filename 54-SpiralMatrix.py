class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        result = []
        row = len(matrix)
        col = len(matrix[0])        
        
        top = 0
        bottom = row-1
        
        left = 0
        right = col-1
        
        while len(result) < row*col:
            
            # left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
                
            # top to bottom
            for j in range(top+1, bottom+1):
                result.append(matrix[j][right])
                
            # right to left
            # ensure we are on a diff row
            if top!=bottom:
                for i in range(right-1, left-1, -1):
                    result.append(matrix[bottom][i])
               
            # left to right
            # ensure we are on a diff col
            if left != right:
                for j in range(bottom-1, top, -1):
                    result.append(matrix[j][left])
            
            # shrinking our martix
            left +=1
            top +=1            
            bottom -=1            
            right -=1            
            
        return result

        # space: O(1)
        # time: o(nm)