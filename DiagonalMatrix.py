"""
Approach:
Use i,j and direction pointers and increase or decrease those according to conditions.

TC O(m*n)
SC O(1)
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # base case
        if len(mat) == 0 or len(mat[0]) == 0:
            return []
        
        m, n, d = len(mat), len(mat[0]), 1   # m is rows, n cols, d is direction
        i, j = 0, 0
        r = []
        
        while len(r) < m*n:
            r.append(mat[i][j])
            if d == 1:
                if i==0 and j != n-1:
                    j+=1
                    d = -1
                elif j == n-1:
                    i+=1
                    d = -1
                else:
                    i -= 1
                    j +=1
            else:
                if j==0 and i != m-1:
                    i+=1
                    d = 1
                elif i == m-1:
                    j+=1
                    d = 1
                else:
                    i += 1
                    j -=1
        return r