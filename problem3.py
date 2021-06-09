class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        m = len(matrix[0])
        n = len(matrix)
        left = 0
        right = m-1
        bottom = n-1
        top = 0
        
        while (top <= bottom and right >=left):
            # adding elements from the top row
            for j in range(left,right+1):
                result.append(matrix[top][j])
            top +=1
            
            #adding elements from the right column
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right -= 1
            
            #adding elements from the bottom row
            if bottom >= top:
                for j in range(right,left-1,-1):
                    result.append(matrix[bottom][j])
            bottom -= 1
            
            #adding elements from left column
            if right >= left:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
            left+=1
        
        return result
    
#Time complexity is O(m*n) where m is the length of row and n is the length of column
#Space complexity is O(1) as we are not using any auxiliary input
#We are reducing all matrix square after each iteration until both sets of pointer dont cross