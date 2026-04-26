# Time Complexity --> O(m*n)
# Space Complexity --> O(1) as there is no auxillary space utilized
# Approach --> We start off with boundaries on 4 sides of the matrix and as we traverse through a row or a column, we manipulate the boundary values to avoid traversing the same elements. 
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top, bottom = 0, m-1
        left, right = 0, n-1

        re = []
        while top<=bottom and left<=right:
            # left to right
            for j in range(left, right+1):
                re.append(matrix[top][j])
            top = top+1

            # top to bottom
            for i in range(top, bottom+1):
                re.append(matrix[i][right])
            right = right-1

            if top<=bottom:
                # right to left
                for j in range(right, left-1, -1):
                    re.append(matrix[bottom][j])
                bottom = bottom-1

            if left<=right:
                # bottom to top
                for i in range(bottom, top-1, -1):
                    re.append(matrix[i][left])
                left = left+1
        
        return re
