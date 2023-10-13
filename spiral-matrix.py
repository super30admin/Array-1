# Time Complexity : O(MN)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Three line explanation of solution in plain english

# This solution traverses the input matrix in a spiral order, starting from the outermost layer and moving towards the center. 
# It maintains four pointers to keep track of the boundaries of the current layer. 
# The algorithm appends the elements in the matrix to the result list according to the desired spiral order, adjusting the pointers after each traversal of the layer.


# Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        left, right = 0, len(matrix[0])
        top, bottom = 0, len(matrix)

        while left < right and top < bottom:
            # get every i in the top row
            for i in range(left, right):
                res.append(matrix[top][i])
            top += 1
            # get every i in the right col
            for i in range(top, bottom):
                res.append(matrix[i][right - 1])
            right -= 1
            if not (left < right and top < bottom):
                break
            # get every i in the bottom row
            for i in range(right - 1, left - 1, -1):
                res.append(matrix[bottom - 1][i])
            bottom -= 1
            # get every i in the left col
            for i in range(bottom - 1, top - 1, -1):
                res.append(matrix[i][left])
            left += 1

        return res
