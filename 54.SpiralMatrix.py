class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix: return []
        
        top = 0    #top
        
        bottom = len(matrix) #bottom 
        
        left = 0 #left
         
        right = len(matrix[0]) #right 
        
        result = []
        
        while(top < bottom or left < right):
            
            
            #right
            if(top < bottom):
                for i in range(left, right):
                    result.append(matrix[top][i])
                top += 1
            #down
            if(left < right):
                for i in range(top, bottom):
                    result.append(matrix[i][right - 1])
                right -= 1
            
            #left
            if(top < bottom):
                for i in range(right - 1, left-1, -1):
                    result.append(matrix[bottom - 1][i])
                bottom -= 1
            #up
            if(left < right):
                for i in range(bottom - 1, top -1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result
    
    
#     T.C => O(N)
#     S.C => O(N)
#     Approach => we are traversing whole matrix, we are defining top, bottom, righ and left respectively. 
# first traverse from top to right and increment top, 
# secondly traverse from top to bottom and decrement right, 
# thirdly traverse from right to bottom and decement bottom, 
# fourthly traverse from bottom to top while increment left and continue till the bottom cross top or left cross the right poisition.