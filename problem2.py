# 498. Diagonal Traverse
# TC : O(N)
# SC : O(1) / O(N)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        p = m * n
        res = []
        i, j = 0, 0
        direction = 1
        while p:
            # print(i, j)
            res.append(mat[i][j])
            # print(res)
            if direction ==1:
                if j == n - 1:
                    direction = -1
                    i += 1
                elif i == 0:
                    direction = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
                p -= 1
            else:
                if i == m - 1:
                    direction = 1
                    j += 1
                elif j == 0:
                    direction = 1
                    i += 1
                else:
                    i += 1
                    j -= 1
                p -= 1
        return res
                    
                    
            
        
        