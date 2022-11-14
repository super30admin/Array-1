# Time Complexity : O(m*n)
# Space Complexity : O(1) (the return array is not accounted as extra space else O(m*n))
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Here we are maintaing 4 variables
# top & bottom(for first and last row)
# left & right(for first and last column)
# a single while iteration will complete a circle of the outermost layer of the matrix
# 1) iterate from left to right and once finished, top++ since we have completely traversed the top row
# 2) iterate from top to bottom(if top was not incremented previously we would have 2 entries for the top corner element)
# then do right++
# Note: after every iteration we need to make sure that top & bottom and left and right have not crossed
# since for the first 2 iterations that conditions has already been checked by the while conditions
# and we don't modify the values in between we can be sure that the indices are still valid without an if condition
# 3) Now since top and right have both been modified we need to check our condition
# since the inner for loop checks for the left and right values we only need to check for top & bottom values explicitly
# 4) same as 3 but with explicit check for left & right since top & bottom are checked by the for loop.
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1
        res = list()
        while ((top <= bottom) and (left<= right)):
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top += 1

            for i in range(top,bottom+1):
                res.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in reversed(range(left,right+1)):
                    res.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in reversed(range(top,bottom+1)):
                    res.append(matrix[i][left])
                left += 1
        return res