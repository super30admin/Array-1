'''
    Time Complexity:
        O(mn) (where m = number of rows, n = number of cols)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Mentioned in the comments
'''
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return res

        rows = len(matrix)
        cols = len(matrix[0])
        i = j = 0
        direction = 1                               # 1 for going up-right and -1 for going down-left


        while len(res) != rows*cols:
            res.append(matrix[i][j])

            if direction == 1:                      # when going up-right
                if j != cols - 1 and i != 0:        # if it is not at the boundary
                    i -= 1
                    j += 1
                else:                               # else, change direction
                    if j == cols - 1:               # if j is at the boundary, increase i to go to the next row
                        i += 1
                    elif i == 0:                    # if i is at the boundary, increase j to go to the next col
                        j += 1
                    direction = -1
            else:                                   # when going down-left
                if i != rows - 1 and j != 0:        # if it is not at the boundary
                    i += 1
                    j -= 1
                else:                               # else, change direction
                    if i == rows - 1:               # if i is at the boundary, increase j to go to the next col
                        j += 1
                    elif j == 0:                    # if j is at the boundary, increase i to go to the next row
                        i += 1
                    direction = 1

        return res
