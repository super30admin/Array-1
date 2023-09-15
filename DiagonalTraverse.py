class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        dir = 1
        index = 0
        result = []
        while (index < m * n):
            result.append(mat[r][c])
            index += 1
            if(dir == 1):
                if(c == n-1):
                    dir = -1
                    r += 1
                elif(r == 0):
                    dir = -1
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                if(r == m-1):
                    dir = 1
                    c += 1
                elif(c == 0):
                    dir = 1
                    r += 1
                else:
                    r += 1
                    c -= 1
        return result
         
mat = [[1,2,3],[4,5,6],[7,8,9]]
output = Solution()
output = output.findDiagonalOrder(mat)
print(output)
