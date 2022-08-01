#  Diagonal Traverse
'''
Leetcode all test cases passed: Yes
Solution:
    findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        n is the no of rows in mat
        m is the no of columns in mat
        Space Complexity: O(1)
        Time Complexity: O(m * n)
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = 0
        col = 0 
        direction_up = True
        res= []
        while row < len(mat) and col < len(mat[0]):
            res.append(mat[row][col])
            if direction_up:
                if col ==  len(mat[0]) - 1:
                    direction_up = not direction_up
                    row += 1
                elif row == 0:
                    direction_up = not direction_up
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row ==  len(mat) - 1:
                    direction_up = not direction_up
                    col += 1
                elif col == 0:
                    direction_up = not direction_up
                    row += 1
                else:
                    row += 1
                    col -= 1
        return res
