"""
I implemented the solution using the technique taught in the session, where I used a flag to indicate the upward and downward directions. Based on the flag, I update the values of i and j accordingly.
Time Complexity: O(mn)
Space Complexity: O(mn)
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        columns = len(mat[0])
        direction = True
        result = [None] * (rows * columns)
        i = j = 0
        for idx in range(len(result)):
            result[idx] = mat[i][j]
            # upwards
            if(direction):
                if j == columns - 1:
                    direction = False
                    i += 1
                elif i == 0:
                    direction = False
                    j += 1
                else:
                    i -= 1
                    j += 1
            # downwards
            else:
                if i == rows - 1:
                    direction = True
                    j += 1
                elif j == 0:
                    direction = True
                    i += 1
                else:
                    j -= 1
                    i += 1
        return result