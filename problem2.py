"""
The idea is to see which conditions we hit at each pass and update the rows and cols accordingly
the TC is o(m*n) and SC is O(1) since we build on result array and not on aux array
"""
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0]) #column
        res = [0] * (m*n)
        r, c = 0,0
        flag = True

        for i in range(m*n):
            res[i] = mat[r][c]
            if flag: #up right
                if c == n - 1: #last element in the top right, increment row
                    r += 1
                    flag = False #go down
                elif r == 0: #its in the first row, increment row then flag hanges
                    flag = False
                    c += 1 #shift the column
                else: #else, update the conditions to move in a up-right direction (column-increase, row decrease)
                    c += 1
                    r -= 1
            else:
                if r == m - 1: #if it is the last row, increment column and switch flag 
                    flag = True
                    c += 1
                elif c == 0: #if its the the first column, increment the row
                    flag = True
                    r += 1
                else:
                    r += 1
                    c -= 1
        return res

