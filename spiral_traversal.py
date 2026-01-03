'''
Time complexity: O(N)
Space complexity: O(N)
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        if not matrix: 
            return res
        top, bottom = 0, len(matrix) - 1
        left, right = 0, len(matrix[0]) - 1

        while top <= bottom and left <= right:

            #moving right 
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1

            #moving down 
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1
            
            #stop the loop if its a 1 xN or Nx1 matrix
            if top > bottom or left > right:
                break 
            # move left
            for i in range(right, left - 1, -1):
                res.append(matrix[bottom][i])
            bottom -= 1 
            
            #move up
            for i in range(bottom, top - 1, -1):
                res.append(matrix[i][left])
            left += 1
        
        return res