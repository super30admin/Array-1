
"""
Given an m x n matrix, return all elements of the matrix in spiral order.

matrix =  [1,2,3,
           4,5,6,
           7,8,9]
spiral matrix = [1,2,3,6,9,8,7,5,4]

Approach : Iteration - 

We maintain variables to track boundaries left and right, top, bottom to keep a track of smaller sub problems

Everytime we are traversing between left, right, top and bottom 

when either left crosses right or bottom crosses top, we stop

If base conditions are breached, we check again

TC = O(m*n) as we visit every element in the matrix
SC = O(1) as we dont need any extra space for aux calculations

"""

class Solution:
    
    def spiralOrder(self, matrix : list[list[int]]) -> list[int]:
        spiral = []
        top = 0
        left = 0
        rows = len(matrix)
        bottom = rows -1
        columns = len(matrix[0])
        right = columns - 1
        
        
        if len(matrix)==0:
            return spiral
        
        while len(spiral) < rows * columns:
        
            # Traverse from left to right
            for j in range(left, right+1):
                spiral.append(matrix[top][j])

           
            # Traverse downwards

            for i in range(top+1, bottom+1):
                spiral.append(matrix[i][right])
            
            # Make sure we are now on a different row
            if top!=bottom:

                for i in range(right-1, left-1, -1):
                    spiral.append(matrix[bottom][i])
                
            # Make sure we are now on a different column
            if left!=right:
                for j in range(bottom-1, top, -1):
                    spiral.append(matrix[j][left])
                

            left += 1
            right -= 1
            top += 1
            bottom -= 1

        return(spiral)


matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]

object = Solution()
spiral = object.spiralOrder(matrix)

print(spiral)

print ('Expected : [1,2,3,4,8,12,11,10,9,5,6,7]')
        


        
