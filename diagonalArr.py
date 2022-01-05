# TC: O(N)
# SC: O(1)
#LC : YESs
# difficulty: i pre-assumed that the both mat and mat[0] length is going to be same
# always, spent 2 days figuring out this one problem why leetcode wasn't working. got myself super confused.
#finally understood what mistake i made
from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not len(mat) or not len(mat[0]):
            return [-1]
        result = []
        row, col, d = 0, 0, 1
        while(curr< len(mat) * len(mat[0])):
            result.append(mat[row][col])
            curr+=1
            if(d== 1):
                if col == len(mat[0]) -1:
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
print(sol.findDiagonalOrder([[2,3]]))