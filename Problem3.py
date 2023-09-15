# ## Problem 3
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
# Example 1:
# Input:
# [[ 1, 2, 3 ],
# [ 4, 5, 6 ],
# [ 7, 8, 9 ]]
# Output: [1,2,3,6,9,8,7,4,5]

# Example 2:
# Input:
# [[1, 2, 3, 4],
# [5, 6, 7, 8],
# [9,10,11,12]]
# Output: [1,2,3,4,8,12,11,10,9,5,6,7]


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m, n = len(matrix), len(matrix[0])
        top, bottom = 0, m-1
        left, right = 0, n-1
        result = []

        while top <= bottom and left <=right:

            #move right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1

            #move down
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right -= 1

            if top <= bottom:
            #move left
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
            #move up
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result

        
