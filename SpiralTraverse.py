class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        output = []
        m = len(matrix)
        n = len(matrix[0])
        
        top = 0
        bottom = m-1
        
        left = 0
        
        right = n-1
        k=0
        while(left <= right and top <= bottom):
            
#           left to right

            for a in range(left,right+1):
            
                output.append(matrix[top][a])
            top +=1
            
#             top to botom
            for b in range(top,bottom+1):
                
                output.append(matrix[b][right])
            right =right -1
#             right to left
            for c in range(right,left-1,-1):
            
                output.append(matrix[bottom][c])
            bottom -=1
            
#             bottom to top
            for d in range(bottom,top-1,-1):
             
                output.append(matrix[d][left])
            left += 1
        return output
            
                