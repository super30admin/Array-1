# Time complexity: O(mn)
# space complexity: O(1)
# approach:
# have two directions: up-1, down -1
# check for boundary conditions



class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        row = 0
        col = 0
        dir = 1
        l = m*n
        for i in range(l):
            result[i] = mat[row][col]
            if dir == 1:
                if col == n-1:
                    dir = -1
                    row = row + 1
                elif row == 0:
                    dir = -1
                    col = col + 1
                else:
                    row = row - 1
                    col = col + 1
            elif dir == -1:
                if row == m-1:
                    dir = 1
                    col = col + 1
                elif col == 0:
                    dir = 1
                    row  = row + 1
                else:
                    row = row + 1
                    col = col - 1
        return result
                
                    
        