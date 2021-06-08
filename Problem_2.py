from typing import List
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat) == 0:
            return 0
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        result = [0] * (m*n)
        dir = 1
        i = 0
        while i < len(result):
            result[i] = mat[r][c]
            
            if dir == 1:
                if c == n-1:
                    r += 1
                    dir = -1
                elif r == 0:
                    dir = -1
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m-1:
                    c += 1
                    dir = 1
                elif c == 0:
                    dir = 1
                    r += 1
                else:
                    c -= 1
                    r += 1
            i += 1
            
        return result

obj = Solution()
print(obj.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(obj.findDiagonalOrder([[1,2],[3,4]]))

# Time Complexity = O (m * n) where m and n are number of rows and columns
# Space Complexity = O(1)