# // Time Complexity : O(m*n) where m and n are length and height of matrix
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode :Yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) == 0:
            return []

        i = int(0)
        j = int(0)
        index = int(0)
        retArr = [0] * (len(mat) * len(mat[0]))
        direction = True

        while i < len(mat) and j < len(mat[0]):
            retArr[index] = mat[i][j]

            if direction:
                if j == len(mat[0]) - 1:
                    i += 1
                    direction = False
                elif i == 0:
                    j += 1
                    direction = False
                else:
                    i -= 1
                    j += 1

            else:
                if i == len(mat) - 1:
                    j += 1
                    direction = True
                elif j == 0:
                    i += 1
                    direction = True
                else:
                    i += 1
                    j -= 1
            index += 1
        return retArr