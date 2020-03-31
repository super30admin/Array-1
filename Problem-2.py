"""
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]


Output: [1,2,4,7,5,3,6,8,9]

Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
// Time Complexity : O(mn)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
"""

def DiagonalMatrix(Matrix):
    if Matrix==None or len(Matrix)==0:
        return Matrix
    rows = len(Matrix)      # calculate rows
    cols = len(Matrix[0])   # number of columns
    output = []             # empty output list /array
    r = 0                   # pointer at left top means 1to keep track of the row we are in
    c = 0                   # pointer at left top to keep track of the column
    i = 1
    direction = 1# means we are going up; -1 means we are moving down
    output.append(Matrix[0][0])
    while i < rows*cols:    # condition
        if direction == 1:  #  if we are moving upward direction in the matrix
            if c == cols-1:
                direction = -1
                r = r+1
            elif r == 0:         # if we are at first row then we need to change the direction to downward and
                direction = -1   # increment the column
                c = c+1

            else:
                r = r-1      # general in up direction we will decrease row and increase col
                c = c+1
        else:                     # for downward direction
            if r == rows-1:        # if we are at last row change direction to upward and increment the col
                direction = 1
                c = c+1
            elif c == 0:     # if we are at first col change direction to upward and increment the row
                direction = 1
                r = r+1
            else:
                r = r+1
                c = c-1
        i=i+1
        output.append(Matrix[r][c])
    return output

print(DiagonalMatrix([

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]))
