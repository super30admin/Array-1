from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        #top bottom left and right defines the boundaries and after each spiral, these boundaries
        #changes

        m = len(matrix) #rows
        n = len(matrix[0]) #cols
        result = []

        top, left, right, bottom = 0, 0, n - 1, m - 1

        while top <= bottom and left <= right:

            for i in range(left, right+1):
                result.append(matrix[top][i])

            top += 1

            for i in range(top, bottom+1): #if top > bottom then this for loop won't run
                result.append(matrix[i][right])
            
            right -= 1

            if top <= bottom: #if base condition var gets mutated always check them again
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])

            bottom -= 1

            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
            left += 1

            
        return result    
    
# Time Complexity: O(m*n)
# Space Complexity: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        #top bottom left and right defines the boundaries and after each spiral, these boundaries
        #changes

        m = len(matrix) #rows
        n = len(matrix[0]) #cols
        result = []

        top, left, right, bottom = 0, 0, n - 1, m - 1

        def helper(matrix, top, left, right, bottom, result):

            if top > bottom or left > right: #That’s the key reason recursion depth is min(m, n). Stop when either dimensionality is
                #exhausted
                return

            for i in range(left, right+1):
                result.append(matrix[top][i])

            top += 1

            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])

            bottom -= 1

            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])

            left += 1

            helper(matrix, top, left, right, bottom,result)

        helper (matrix, top, left, right, bottom, result)

        return result
    
# Recursive solution:

# Time Complexity: O(m*n)
# Space Complexity:  recursive stack depends no. of spirals
# O(min(m, n))
# because each recursive call removes one spiral layer, and the number of layers is bounded by the smaller matrix dimension.
# After one recursive call, the matrix shrinks like this (m-2) rows*(n-2) cols. Each call reduces both dimensions.
#ceil(min(m, n) / 2) = 3, basically whichever exhausts first either row or col.
