# Time Complexity : O(m*n)
# Space Complexity : O(1) (the return array is not accounted as extra space)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Here we maintain a direction flag to indicate whether we need to traverse upwards or downwards
# 1) for upward traverse (direction = 1):
# # we need to check for 2 cases : i.e. if it's the topmost element OR if it's the top corner element of the first row
# we first check for the case when we hit the last column since
# if it's the corner element and we check for curr_row==0 condition, we would perform curr_col+=1 giving an index out of bounds
# so we would increment the row and reverse the direction
# else: if it's a top row element and not a corner element we increment the column no. and reverse direction
# if the current element is any element in the middle, we just traverse the row(--) and col(++)

# 1) for downward traverse (direction = -1):
# # we need to check for 2 cases : i.e. if it's the bottom element OR if it's the bottom corner element of the last row
# we first check for the case when we hit the last row since
# if it's the corner element and we check for curr_col==0 condition, we would perform curr_row+=1 giving an index out of bounds
# so we would increment the col and reverse the direction
# else: if it's a bottom column element and not a corner element we increment the column no. and reverse direction
# if the current element is any element in the middle, we just traverse the row(++) and col(--)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction:int = 1
        res = list()
        rows:int = len(mat)
        cols:int = len(mat[0])
        curr_row:int = 0
        curr_col:int = 0

        while (len(res) < (rows*cols)):
            res.append(mat[curr_row][curr_col])
            if direction == 1:
                if curr_col == cols-1:
                    curr_row += 1
                    direction = -1
                elif(curr_row == 0):
                    curr_col += 1
                    direction = -1
                else:
                    curr_row-=1
                    curr_col+=1
            else:
                if curr_row == rows-1:
                    curr_col += 1
                    direction = 1
                elif(curr_col == 0):
                    curr_row += 1
                    direction = 1
                else:
                    curr_row+=1
                    curr_col-=1
        return res