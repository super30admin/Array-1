# Time Complexity : O(m*n) m, n are dimensions of matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        first_row = 0
        last_row = len(matrix)-1
        first_col = 0
        last_col = len(matrix[0])-1
        result = []
        
        next_direction = "right"
        while (len(result) < (len(matrix)*len(matrix[0]))):
            if next_direction == "right":
                for i in range(first_col,last_col+1):
                    result.append(matrix[first_row][i])
                next_direction = "down"
                first_row += 1
            if next_direction == "down":
                for i in range(first_row,last_row+1):
                    result.append(matrix[i][last_col])
                next_direction = "left"
                last_col -= 1
            if next_direction == "left" and first_row<= last_row:
                for i in range(last_col,first_col-1,-1):
                    result.append(matrix[last_row][i])
                next_direction = "up"
                last_row -= 1
            if next_direction == "up" and first_col<= last_col:
                for i in range(last_row,first_row-1,-1):
                    result.append(matrix[i][first_col])
                next_direction = "right"
                first_col += 1
        return result