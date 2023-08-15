class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        n = len(mat)
        m = len(mat[0])
        i = 0
        j = 0
        dir = 1
        idx = 0
        result = [0 for i in range(m*n)]

        while(idx<len(result)):
            result[idx]=mat[i][j]
            idx += 1
            if dir == 1:
                if j == n-1:
                    i += 1
                    dir = -1
                elif i == 0:
                    j += 1
                    dir =-1
                else:
                    i -=1
                    j +=1
            else:
                if i == n-1:
                    j += 1
                    dir = 1
                elif j == 0:
                    i += 1
                    dir = 1  
                else:
                    i += 1
                    j -= 1
        return result


