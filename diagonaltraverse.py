class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if len(matrix) == 0:
            return result
        else:
            dir = 1
            r = 0
            c = 0
            n = len(matrix)
            m = len(matrix[0])
            
            result.append(matrix[r][c])
            while len(result) != n*m:
                if dir == 1:
                    dir = -1
                    if (c + 1 < m):
                        c = c + 1
                        result.append(matrix[r][c])
                    elif (c == m-1) and (r < n):
                        r = r + 1
                        result.append(matrix[r][c])
                    while (r + 1 < n) and (c - 1 >= 0):
                        r = r + 1
                        c = c - 1
                        result.append(matrix[r][c])
                elif dir == -1:
                    dir = 1
                    if (r + 1 < n):
                        r = r + 1
                        result.append(matrix[r][c])
                    elif (r  == n-1) and (c < m) :
                        c = c + 1
                        result.append(matrix[r][c])
                    while (r - 1 >= 0) and (c + 1 < m):
                        r = r - 1
                        c = c + 1
                        result.append(matrix[r][c])
            return result
 #TC: O(nm) 
 #SC: O(1)
