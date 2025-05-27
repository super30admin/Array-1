"""
TC -> O(m*n)
SC -> O(m*n) for the result list
Logic
1. Use direction flag to identify which direction to move(up/down)
2. Check for breaches in up->
        first check right side breach->i+1,j, direction->False
        then check top breach->i,j+1,direction->False
        if no breach then proceed in same direction->i-1,j+1
3. Check for breaches in down->
        first check bottom  breach->i,j+1, direction->True
        then check left breach->i+1,j,direction->True
        if no breach then proceed in same direction->i+1,j-1

Easy Mnemonic (for personal use) U->RU,D->DL
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        res = []
        i = j = 0
        direction = True

        for _ in range(m * n):
            res.append(mat[i][j])
            if direction:
                # up direction, first check column overflow
                if j == n - 1:
                    direction = False
                    i += 1
                elif i == 0:
                    direction = False
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                # down direction, check row overflow first
                if i == m - 1:
                    direction = True
                    j += 1
                elif j == 0:
                    direction = True
                    i += 1
                else:
                    i += 1
                    j -= 1
        return res
