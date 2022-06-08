# TC : O(M*N)
# SC: O(1)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if not mat: return []
        len_row = len(mat)
        len_col = len(mat[0])
        
        result = []
        row = col = 0
        for i in range(len_row * len_col):
            result.append(mat[row][col])
            if (row + col) % 2 == 0:
                
                if col == len_col -1:
                    row += 1
                elif row == 0:
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == len_row -1:
                    col += 1
                elif col == 0:
                    row += 1
                else:
                    row += 1
                    col -= 1   
        return result