'''
Time Complexity: O(N*M)
Space Complexity: O(1)
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row = len(matrix)
        col = len(matrix[0])
        top = left = 0
        bottom = row-1
        right = col-1
        op = []
        while(top<=bottom and left<=right):
            # Left to Right
            temp_iter = left
            while(temp_iter <=right and top<=bottom):
                op.append(matrix[top][temp_iter])
                temp_iter +=1
            top +=1
            # Right to Bottom
            temp_iter = top
            while(temp_iter<=bottom and left<=right):
                op.append(matrix[temp_iter][right])
                temp_iter +=1
            right -=1
            # Bottom to Left
            temp_iter = right
            while(temp_iter>=left and top<=bottom):
                op.append(matrix[bottom][temp_iter])
                temp_iter -=1
            bottom -=1
            # Left to Top
            temp_iter = bottom
            while(temp_iter>= top and left<=right):
                op.append(matrix[temp_iter][left])
                temp_iter -= 1
            left+= 1
        return op
            
            
                
               
            
        