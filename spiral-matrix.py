
# time O(n*m), space O(n*m)
# track top, left, right, bottom pointers and iterate through the spiral of the matrix, adding each matrix value to result
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []

        n = len(matrix) # rows
        m = len(matrix[0]) # cols

        left = 0
        right = m - 1
        top = 0
        bottom = n - 1

        while left <= right and top <= bottom: 
            for c in range(left, right+1):
                result.append(matrix[top][c])
            top+=1
            for r in range(top,bottom+1):
                result.append(matrix[r][right])
            right-=1

            if not (left <= right and top <= bottom):
                break 

            for c in range(right, left-1,-1):
                result.append(matrix[bottom][c])
            bottom -= 1
            for r in range(bottom, top-1, -1):
                result.append(matrix[r][left])
            left+=1

            

        return result