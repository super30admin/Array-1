"""
We define  bounds (top, bottom, left, right) to extract rows and columns in spiral.
At each level, go right → down → left → up and then shrink the bounds.
"""

#Time Complexity: O(M*N)
#Space Complexity: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left,up = 0,0
        rw,col = len(matrix), len(matrix[0])
        right,bottom = col-1, rw-1
        result = []
        while(len(result) < rw*col):
        
            #traverse from left to right
            for i in range(left,right+1):
                result.append(matrix[up][i])
            up+=1
           
            #traverse from top to bottom
            for i in range(up,bottom +1):
                result.append(matrix[i][right])
            right-=1

            #right to left
            if up<=bottom:
                for i in (range(right,left-1,-1)):
                    result.append(matrix[bottom][i])
            bottom-=1

            #bottom to up
            if left<=right:
                for i in (range(bottom,up-1,-1)):
                    result.append(matrix[i][left])
            left+=1
        return result


        