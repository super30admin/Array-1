"""
498. Diagonal Traverse
Time Complexity - O(n*m)
Space Complexity - O(1)
Direction - Upward - 1
            Downward - -1
While loop for m*n
    append value in list
    direction upward
       i) j == m-1:
          dirs = -1
          i += 1
       ii) i == 0
           dirs = -1
           j += 1
       ii) i -= 1
           j+= 1
    direction downward
        i) i == n-1:
           dirs = 1
           j += 1
        ii)j == 0:
           dirs = 1
           i += 1
        iii)i += 1
            j -= 1
"""
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) == 0 or len(matrix[0]) == 0:
            return 
        n = len(matrix)
        m = len(matrix[0])
        index = 0
        dirs = 1
        output = [0]*(m*n)
        i = 0
        j = 0
        while(index < m*n):
            output[index] = matrix[i][j]
            index += 1
            if dirs == 1:
                if j == m-1:
                    dirs = -1
                    i += 1
                elif i == 0:
                    dirs = -1
                    j += 1
                else:
                    i -= 1
                    j+= 1
            else:
                if i == n-1:
                    dirs = 1
                    j += 1
                elif j == 0:
                    dirs = 1
                    i += 1
                else:
                    i += 1
                    j -= 1          
        return output   