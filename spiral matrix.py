# // Time Complexity : O(nm)
# // Space Complexity : o(n)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english:
# assign the variables for left, right, up and down. iterate through the 
# matrix according to the rules and append the cells to the result.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        rows, columns = len(matrix), len(matrix[0])
        left = up = 0 
        right = columns - 1 
        down = rows - 1
        
        while len(result) < rows * columns:
            
            # traverse left to right
            for col in range(left, right + 1):
                result.append(matrix[up][col])
                
            # traverse top to down
            for row in range(up + 1, down + 1):
                result.append(matrix[row][right])
            
            # check not at same row
            if up != down:
                # traverse right to left
                for col in range(right - 1, left - 1, -1):
                    result.append(matrix[down][col])
            
            # check not at same column
            if left != right:
                # travere down to top
                for row in range(down - 1, up, -1):
                    result.append(matrix[row][left])
                
            # update boundaries for next spiral
            left += 1
            right -= 1
            up += 1
            down -=1
        
        return result