'''
TC: O(m*n)
SC: O(1)
'''
from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        ROWS, COLS = len(mat), len(mat[0])
        i,j = 0,0
        res = []

        while i>=0 and j>=0 and i<ROWS and j<COLS:
            #Up
            while i>=0 and j>=0 and i<ROWS and j<COLS:
                res.append(mat[i][j])
                i-=1
                j+=1
            if j>=COLS:
                i+=1
                j-=1
            i+=1
            #Down
            while i>=0 and j>=0 and i<ROWS and j<COLS:
                res.append(mat[i][j])
                i+=1
                j-=1
            if i>=ROWS:
                j+=1
                i-=1
            j+=1
        return res
s = Solution()
print(s.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(s.findDiagonalOrder([[1,2],[3,4]]))