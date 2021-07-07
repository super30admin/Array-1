class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if not mat:
            return [0]
        
        dirVal = 1
        m = len(mat)
        n = len(mat[0])
        row = 0
        col = 0
        i = 0
        result = []
        
        while i < m*n:
            result.append(mat[row][col])
            # up dir
            if dirVal == 1:
                if col == n-1:
                    row += 1
                    dirVal = -1
                elif row == 0:
                    col += 1
                    dirVal = -1
                else:
                    row -= 1
                    col += 1
            else: # down
                if row == m-1:
                    col += 1
                    dirVal = 1
                elif col == 0:
                    row += 1
                    dirVal = 1
                else:
                    row += 1
                    col -= 1
            
            i += 1
        
        return result
    
# TC: O(MN) SC: O(1)
# traversing through a matrix diagonally in 2 directions, up(r-- c++) and down(c-- r++).
# taking edge cases first to avoid out of bounds exception 