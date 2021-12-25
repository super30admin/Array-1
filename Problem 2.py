# Time: O(m*n)
# Space: O(1)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        # 1 -> up
        # 0 -> down
        direction = 1
        diag_traversal = []
        count = 0
        tot_count = len(mat)*(len(mat[0]))
        row = 0
        col = 0
        while count < tot_count:
            #print(mat[row][col])
            diag_traversal.append(mat[row][col])
            if direction == 1:
                if col == len(mat[0]) -1:
                    row += 1
                    direction = 0
                elif row == 0:
                    col += 1
                    direction = 0
                else:
                    row -= 1
                    col += 1
            else:
                if row == len(mat) - 1:
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1
            count+= 1
        return diag_traversal
        
