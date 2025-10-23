# Time: O(m*n)
# space:O(1)
# Que => Return an array by iterating through the matrix spirally
# have 4 variables to control the edges then loop while left doesn't cross right and top doesn't cross bottom
# then as we are updating the base variables keep in mind to check the conditions before performing anything

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        right = n - 1
        bottom = m - 1
        left = 0

        result = []
        while left <= right and top <= bottom:
            # Top row
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top += 1
            # We are changing the base case that is why we check if it is changed again because we are changing top in previous loop
            if top <= bottom:
                # Right most row
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right -= 1

            if left <= right and top <= bottom:
                # Bottom row
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            if left <= right and top <= bottom:
                # Left row
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left += 1
        return result
            