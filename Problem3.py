# ## Problem 3
# https://leetcode.com/problems/spiral-matrix/
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

# Example 1:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]
# Output: [1,2,3,6,9,8,7,4,5]
# Example 2:

# Input:

# [

# [1, 2, 3, 4],

# [5, 6, 7, 8],

# [9,10,11,12]

# ]
# Output: [1,2,3,4,8,12,11,10,9,5,6,7]


# Time Complexity: O(m * n)
# Space Complexity: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        left, top = 0, 0
        right, bottom = n - 1, m - 1
        result = []
        
        while left <= right and top <= bottom:
            # 1. Traverse from Left to Right along the Top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            
            # 2. Traverse from Top to Bottom along the Right column
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            
            # Make sure we are now on a different row
            if top <= bottom:
                # 3. Traverse from Right to Left along the Bottom row
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
                
            # Make sure we are now on a different column
            if left <= right:
                # 4. Traverse from Bottom to Top along the Left column
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
                
        return result