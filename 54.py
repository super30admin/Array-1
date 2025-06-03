# Time O(mxn)
# Space O(mxn)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        r = len(matrix)
        c = len(matrix[0])
        left,right,top,bottom = 0, c-1, 0, r-1
        output = []
        while left<=right and top<=bottom:
            # right to left (on the top edge)
            for j in range(left,right+1):
                output.append(matrix[top][j])
            top += 1
            
            # top to bottom (on the right edge)
            for i in range(top,bottom+1):
                output.append(matrix[i][right])
            right -= 1
            
            if top<=bottom:    
                # right to left (on the bottom edge)
                for j in range(right,left-1,-1):
                    output.append(matrix[bottom][j])
                bottom -= 1

            if left<=right:
                # bottom to top (on the left edge)
                for i in range(bottom,top-1, -1):
                    output.append(matrix[i][left])
                left +=1

        return output

