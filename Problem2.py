# Time Complexity : O(MN)
# Space Complexity : O(MN)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - Start with row zero and column zero and keep variable rowchanges and columns changes that occures everytime in the loop.
# - Check for all 4 cases when 1) row is at -1 2) row is at length of row 3) col is at -1 2) col is at length of col
# - Run the while loop till row and col reach their respective length and after exit append last element.

# Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
#       Taking length of row and if it is zero return empty array
        maxrow = len(matrix)
        if maxrow == 0:
            return []
#       Taking length of column and if it is zero return empty array
        maxcol = len(matrix[0])     
        if maxcol == 0:
            return []
#       start with row 0 and colum 0
        row, col = 0, 0
#       First we want to move up diagonaly so initialize row and column changes to reflect that
        rowchange, colchange = -1, 1
#       initilizing answer array
        ans = []
        
#       running the loop till we reach at the last element of last row.
        while(row != maxrow-1 or col != maxcol-1):
        
#           Handling the case when col crosses upper bound
            if(col == maxcol):
#               reducing the column and incresing row by 2
                row += 2
                col -= 1
#               Flipping the changes.
                rowchange = 1
                colchange = -1
                continue
            
#           Handling the case when row crosses lower bound
            if (row == -1):
#               Just needs to incraese the row
                row += 1
#               Flipping the changes.
                rowchange = 1
                colchange = -1
                continue
        
#           Handling the case when row crosses upper bound
            if(row == maxrow):
#               reducing the row and incresing column by 2
                col += 2
                row -= 1
#               Flipping the changes.
                rowchange = -1
                colchange = 1
                continue
            
#           Handling the case when column crosses lower bound
            if (col == -1):
#               Just needs to incraese the column
                col += 1
#               Flipping the changes.
                rowchange = -1
                colchange = 1
                continue

#           Appending element to the array
            ans.append(matrix[row][col])
#           Updating row and column
            row += rowchange
            col += colchange
        
#           Appending last element to the array
        ans.append(matrix[maxrow-1][maxcol-1])
        return ans
                
    
        