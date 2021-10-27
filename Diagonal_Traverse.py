class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        up = True
        i = 0
        j = 0
        m = len(mat)
        n = len(mat[0])
        final = []
        while len(final) != m*n:
            if up:
                final.append(mat[i][j])
                if j == n-1:    #j first because it can't go down from not in range.
                    i += 1
                    up = False
                elif i == 0:
                    j += 1
                    up =False
                else:
                    i -= 1
                    j += 1
            else:
                final.append(mat[i][j])
                if i == m-1:
                    j += 1
                    up = True
                elif j == 0:
                    i += 1
                    up = True
                else:
                    i += 1
                    j -= 1
                    
        return final
                
                
        
        