# T.C. O(m*n)
# S.C. O(m*n)

# We are simulating how the diagonal traversal works
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat) #no of rows
        n = len(mat[0]) #no of cols
        i,j = 0,0
        dir = True
        result = [0] * (m*n)
        for idx in range(m*n):
            result[idx] = mat[i][j]
            if dir: #up
                if j == n - 1:
                    i+=1
                    dir = False
                elif i == 0:
                    j+=1
                    dir = False
                else:
                    i-=1
                    j+=1
            else: #Down
                if i == m - 1:
                    j+=1
                    dir = True
                elif j == 0:
                    i+=1
                    dir = True
                else:
                    i+=1
                    j-=1
        return result
