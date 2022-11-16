class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        ## T.C = O(m*n)
        ## S.C = O(1)
        
        direction = 1
        m = len(mat) - 1
        n = len(mat[0]) - 1
        res = []
        i, j = 0, 0
        
        for k in range(((n+1)*(m+1))):
            
            res.append(mat[i][j])

            if direction == 1:
                if j == n:
                    i += 1
                    direction = -1
                elif i == 0:
                    j += 1
                    direction = -1
                else:
                    i -= 1
                    j += 1

            elif direction == -1:
                if i == m:
                    j += 1
                    direction = 1

                elif j == 0:
                    i += 1
                    direction = 1

                else:
                    i += 1
                    j -= 1

        return res