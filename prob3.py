# Time Complexity : O(M * N)
# Space Complexity : O(1) as no extra space, just the output array
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : traverse the array 
# from left to right, top to bottom, right to left and finally bottom to top.


def spiralMatrix(matrix):
    
    m = len(matrix)
    n = len(matrix[0])
    top, bottom = 0, m - 1
    left, right = 0, n - 1
    res = []

    while (top <= bottom and left <= right):

        # top row
        if (top <= bottom):
            for j in range(left, right+1, 1):
                res.append(matrix[top][j])
            top += 1
        
        # right most column
        if (left <= right):
            for i in range(top, bottom+1, 1):
                res.append(matrix[i][right])
            right -= 1
        
        # bottom row
        if (top <= bottom):
            for j in range(right, left - 1, -1):
                res.append(matrix[bottom][j])
            bottom -= 1

        # left most column
        if (left <= right):
            for i in range(bottom, top - 1, -1):
                res.append(matrix[i][left])
            left += 1 
    return res