# Time Complexity :O(mn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
# Traverse the matrix layer by layer in a spiral order, moving top row → right column → bottom row → left column.
# After completing each side, update the boundaries (top++, bottom--, left++, right--) to move inward.
# put four pointers. Repeat until all elements are added to the output list.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m-1
        left = 0
        right =n-1
        output = []
        while (left <= right and top <= bottom):
            for i in range(left,right+1):
                output.append(matrix[top][i])
            top += 1
            for i in range(top,bottom+1):
                output.append(matrix[i][right])
            right -= 1
            if top <= bottom:
                for i in range(right, left-1, -1):
                    output.append(matrix[bottom][i])
                bottom -= 1
            if left <= right:
                for i in range(bottom,top-1,-1):
                    output.append(matrix[i][left])
                left += 1
        return output