# Time Complexity : O(n) because we are traversing the array once
# Space Complexity : O(1) because we are not using any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we using the direction variable to traverse the array in the right direction 
and change the direction whenever we reach the end of the matrix. The order of how we check 
if we are at the end of the matrix is important because if we check the column/row first then 
we will get an index out of range error.
"""

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row, column, index, direction, m, n = 0, 0, 0, 1, len(mat), len(mat[0])
        answer = [0 for i in range(m*n)]

        while index < (m*n):
            answer[index] = mat[row][column]
            index +=1

            if direction == 1:
                if column == n-1:
                    direction = -1
                    row += 1
                elif row == 0:
                    direction = -1
                    column += 1
                else:
                    row -= 1
                    column += 1
            else:
                if row == m-1:
                    direction = 1
                    column += 1
                elif column == 0:
                    direction = 1
                    row += 1
                else:
                    row += 1
                    column -= 1

        return answer
