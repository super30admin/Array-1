# Time Complexity: O(mxn)
# Space Complexity: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if(len(matrix)==0):
            return result
        top = 0
        bottom = len(matrix)-1
        left = 0
        right = len(matrix[0])-1
        i = 0
        j = 0
        
        
        while(top<=bottom and left<=right):
            
            # move right
            for p in range(left,right+1):
                result.append(matrix[top][p])
                
            top += 1
            
            if(top > bottom):
                break
            
            # move down
            for q in range(top,bottom+1):
                result.append(matrix[q][right])
                
            right -= 1
            
            if(right<left):
                break
            
            # move back left
            for r in range(right,left-1,-1):
                result.append(matrix[bottom][r])
            
            bottom -= 1
            
            # move up
            for s in range(bottom, top-1, -1):
                result.append(matrix[s][left])
            
            left += 1
        
        return result