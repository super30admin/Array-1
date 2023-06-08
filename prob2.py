#  Time Complexity : O(m*n)
# Space Complexity :O(m*n)
# Leet Code: Yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        idx = 0
        row = len(mat)
        col = len(mat[0])
        arr = [None for i in range(row*col)]
        n = row*col
        flag = True
        r = c = 0

        while idx < n:
            arr[idx] = mat[r][c]
            idx += 1
            if flag:
                if r == 0 and c != col-1:
                    c += 1
                    flag = False
                elif c == col-1:
                    r += 1
                    flag = False
                else:
                    r -= 1
                    c += 1
            else:
                if c == 0 and r != row-1:
                    r += 1
                    flag = True
                elif r == row-1:
                    c += 1
                    flag = True
                else:
                    r += 1
                    c -= 1
        return arr