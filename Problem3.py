# Time Complexity : O(mn)
# Space Complexity : O(mn)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - Create new matrix to keep track of visited elements.
# - Change direction when current is out of bound or visited

# Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
#       If matrix is empty than return empty list
        if not matrix:
            return []
#       Storing max row and column value
        maxrow = len(matrix) 
        maxcol = len(matrix[0]) 
#       Initialize visited matrix with false
        visited = [ [False] * maxcol for row in matrix]
        ans = []
#       Storing direction related delta for row and column
        direction = {0:(0, 1), 1:(1, 0),2:(0, -1),3:(-1, 0)}
#       Initializing current direction and row column delta and current row and current column.
        cur_dir = 0
        (row_delta, col_delta) = direction[cur_dir]
        cur_row = 0
        cur_col = 0
        
#       Running the for loop for every element
        for _ in range(maxrow * maxcol):
#       Appending element to the answer and marking it visited
            ans.append(matrix[cur_row][cur_col])
            visited[cur_row][cur_col] = True
#           Updating curent row and column by adding delta
            upd_row = cur_row + row_delta
            upd_col = cur_col + col_delta
            
#           If current row and column is in the bound and not visited than keep the update
            if((0 <= upd_row < maxrow) and (0 <= upd_col < maxcol) and (visited[upd_row][upd_col] == False) ):
                cur_row = upd_row
                cur_col = upd_col
#           If it is breakig above condition than we need to change the direction and discard the last update in row and column
            else:
#               updating the direction and delta
                cur_dir = (cur_dir + 1) % 4
                (row_delta, col_delta) = direction[cur_dir]
#               updating the current row and column according to latest direction
                cur_row += row_delta
                cur_col += col_delta
                
        return ans
