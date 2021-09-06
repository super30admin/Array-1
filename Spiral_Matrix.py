#Spiral Matrix
# time complexity: O(N*M)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows = len(matrix)
        cols = len(matrix[0])
        top = 0
        left = 0
        down = rows - 1
        right  = cols - 1
        res = []
        direction = 0
        while left <= right and top <= down:
            if direction == 0:
                for i in range(left, right +1):
                    res.append(matrix[top][i])
                top +=1
            if direction == 1:
                for i in range(top, down + 1):
                    res.append(matrix[i][right])
                right -= 1
            if direction == 2:
                for j in range(right, left-1, -1):
                    res.append(matrix[down][j])
                down -= 1
            if direction == 3:
                for j in range(down, top-1, -1):
                    res.append(matrix[j][left])
                left += 1
            
            direction = (direction + 1) % 4
        return res
                