# https://leetcode.com/problems/diagonal-traverse/
# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        n, m = len(matrix), len(matrix[0])
        
        result = [0 for x in range(m*n)]
        resIndex = 0
        
        direction = "UP"
        row, col = 0, 0
        if m == 1:
            for i in range(n):
                result[i] = matrix[i][0]
        elif n == 1:
            for i in range(m):
                result[i] = matrix[0][i]
        else:
            while(resIndex <= (m*n-1)):

                result[resIndex] = matrix[row][col]
                resIndex += 1

                if direction == "UP":
                    #change direction
                    if col == m-1:
                        direction = "DOWN"
                        row += 1
                    elif row == 0:
                        direction = "DOWN"
                        col += 1
                    else:
                        row -= 1
                        col += 1
                else:
                    if row == n-1:
                        direction = "UP"
                        col += 1
                    elif col == 0:
                        direction = "UP"
                        row += 1
                    else:
                        row += 1
                        col -= 1
        return result