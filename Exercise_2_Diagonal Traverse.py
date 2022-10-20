'''
Time Complexity : O(N*M), N: no of row, M:no of cols
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
'''



class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction_UP = True
        m, n = len(mat), len(mat[0])
        res = [0 for i in range(m*n)]
        row, col = 0, 0
        res_index = 0

        #Edge Cases
        if len(mat) == 0: return 0
        if len(mat) == 1: return mat[0]

        while res_index < len(res):

            res[res_index] = mat[row][col]
            res_index += 1

            #When moving direction is UP
            if direction_UP == True:
                if col == n-1:
                    direction_UP = False
                    row += 1
                elif row == 0:
                    direction_UP = False
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
            #When moving direction is DOWN
                if row == m-1:
                    direction_UP = True
                    col += 1
                elif col == 0:
                    direction_UP = True
                    row += 1
                else:
                    row += 1
                    col -= 1

        return res

