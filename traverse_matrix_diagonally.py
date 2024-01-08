""" Explanation: In order to traverse, I created the add diagnoal function that starts traversing either from the top right or bottom left.
    In the case below, its the top right corner. I have four pointers, each keeps the track of one of the 4 direction respectively. 
    Then once we have the starting position, we get the diagonals of the matrix, and then iterate over those diagonals to get the path.
    Time Complexcity: O(n*m), where m is the length of the outer list, and n is the length of the inner list
    Space Complexcity: O(1)
"""


class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        res = []
        m,n = len(mat), len(mat[0])
        top_right = True
        right = left = top = bottom = 0

        def addDiagnoal(start_row, start_col, end_row, end_col, inc):
            row, col = start_row, start_col

            while(row, col) != (end_row, end_col):
                res.append(mat[row][col])
                row -= inc
                col += inc
            res.append(mat[row][col])
        
        while(len(res) < n*m):
            if top_right:
                addDiagnoal(bottom,left,top,right,1)
            else:
                addDiagnoal(top,right,bottom,left,-1)

            if right+1 < n:
                right += 1
            else:
                top += 1

            if bottom + 1 <m:
                bottom += 1
            else:
                left += 1
            
            top_right = not top_right

        return res
        