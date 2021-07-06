# Time Complexity : O(m*n) - number of elements in the matrix. 
# Space Complexity : O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or len(mat) == 0:
            return []

        m = len(mat)
        n = len(mat[0])
        result = [None for _ in range(m*n)]
        i = 0
        r = 0
        c = 0
        dir_ = 1 

        while i < m*n:
            result[i] = mat[r][c]

            # direction = top
            if dir_ == 1:
                # last column -> change direction and increase row
                if c == n - 1:
                    r += 1 
                    dir_ = -1
                # first row -> change direction, increase column
                elif r == 0:
                    c += 1 
                    dir_ = -1 
                # regular element, increase column, decrease row
                else:
                    c += 1 
                    r -= 1 

            # direction = down
            else:
                # last row -> change direction, column increases
                if r == m - 1:
                    c += 1 
                    dir_ = 1 
                # first column -> increase row, change direction
                elif c == 0:
                    r += 1 
                    dir_ = 1 
                # regular element, increase row, decrease column
                else:
                    r += 1
                    c -= 1 

            i += 1 

        return result