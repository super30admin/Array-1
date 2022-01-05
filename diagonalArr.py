# TC: O(N)
# SC: O(1)
#LC : YESs
from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not len(mat) or not len(mat[0]) or len(mat) != len(mat[0]):
            return [-1]
        result = [None for i in range(len(mat)*len(mat))]
        curr = 0
        row, col, d = 0, 0, 1
        while(curr< len(mat) * len(mat)):
            result[curr] = mat[row][col]
            curr+=1
            if(d== 1):
                if col == len(mat) -1:
                    row+=1
                    d=-1
                elif row == 0:
                    col+=1
                    d=-1
                else:
                    row-=1
                    col+=1
            else:
                if row == len(mat) -1:
                    col+=1
                    d=1
                elif col == 0:
                    row += 1;
                    d=1
                else:
                    col -= 1
                    row +=1
        return result
sol = Solution()
print(sol.findDiagonalOrder2([[1,2,3],[4,5,6],[7,8,9]]))