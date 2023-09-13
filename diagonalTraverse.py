# Time Complexity : O(m*n)
# Space Complexity : O(1)

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m, n = len(mat), len(mat[0])
        dir = 1
        row, col = 0, 0
        res = [0 for x in range(m*n)]


        for i in range(len(res)):
            res[i]=mat[row][col]
            if (dir == 1):
                if col == n-1:
                    dir = -1
                    row +=1
                
                elif (row == 0):
                    dir = -1
                    col += 1

                else:
                    row -= 1
                    col += 1
            else:
                if row == m-1:
                    dir = 1
                    col +=1
                
                elif (col == 0):
                    dir = 1
                    row +=1

                else:
                    row += 1
                    col -= 1
        return res
