# ## Problem 2

# Given a matrix of M x N elements (M rows, N columns),
# return all elements of the matrix in diagonal order as shown in
# the below image.
# Example:
# Input:
# [
# [ 1, 2, 3 ],
# [ 4, 5, 6 ],
# [ 7, 8, 9 ]
# ]
# Output: [1,2,4,7,5,3,6,8,9]

# // Time Complexity : O(m*n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
def findDiagonalOrder(mat):
    # number of rows
    m = len(mat)
    # number of cols
    n = len(mat[0])
    # variables denoting row and column and idx of result array
    r = c = idx = 0
    # creating result array of size (m * n)
    result = [0] * (m*n)
    # direction denoting up --> 1 and down --> -1
    direc = 1
    # iterating over the board
    while (idx < (m*n)):
        # adding to the result array
        result[idx] = mat[r][c]
        # incrementing idx
        idx += 1
        # upwards
        if (direc == 1):
            # last col handle
            if (c == n-1):
                r += 1
                direc = -1
            # first row handle
            elif (r == 0):
                c += 1
                direc = -1
            else:
                c += 1
                r -= 1
        else:
            # last row handle
            if (r == m-1):
                c += 1
                direc = 1
            # first col handle
            elif (c == 0):
                r += 1
                direc = 1
            else:
                r += 1
                c -= 1
    return result


mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
print(findDiagonalOrder(mat))
