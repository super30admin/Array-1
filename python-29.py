# Problem: LC 498. Diagonal Traverse (Array-1)
# Approach: Finding the edge cases when the coordinates change rows and columns across the directions of traversal upwards and downwards.
# Time Complexity: O(m*n) where m & n are number of rows and columns of matrix resp.
# Space complexity: O(1) constant
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        a = []
        # edge case
        if len(matrix) == 0 or matrix == []:
            return a
        i, row, col = 0, 0, 0
        m = len(matrix)  # num of rows
        n = len(matrix[0])  # num of columns
        print(m, n)

        dir = 1  # initailly direction upwards and dir = -1 , implies direction is downwards
        print("111", a, row, col, dir)
        while i < (m * n):
            a.append(matrix[row][col])
            if (dir == 1):  # upward direction
                # if col == n-1 and row == 0:

                if col == n - 1:  # continue going up consider 4 * 3 matrix and should always do this first as with row ==0  in a 3* 3 matrix  if we increment col first we get error
                    # a.append(matrix[row][col])
                    row += 1
                    dir = -1
                elif row == 0:  # change direction when
                    # row -=1
                    col += 1
                    dir = -1

                else:
                    row -= 1
                    col += 1
                # a.append(matrix[row][col])
            else:  # downward direction
                if row == m - 1:  # continue going down
                    # a.append(matrix[row][col])
                    col += 1
                    dir = 1
                elif col == 0:  # change directon when
                    # a.append(matrix[row][col])
                    row += 1
                    dir = 1
                else:  # normal case
                    row += 1
                    col -= 1

            i += 1
        return a
#k= [[1,2,3],[4,5,6],[7,8,9]]
l=[[2,5],[8,4],[0,-1]]
j = Solution()
#print("Result !!!!!",j.findDiagonalOrder(k))
print("Result !!!!!",j.findDiagonalOrder(l))









