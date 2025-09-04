class Solution:
    #     // Time Complexity : O(n*m) # traverse the whole matrix
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
    def spiralOrder(self, matrix):
        # sprial matrix is move to the right and once reached till end we move till the bottom and end till the left of the matrix 
        # and till 1 less than the top and keep gng and once top or bottom are crossed or left and right are crossed we reached the end point 
        # of the spiral matrix

        m = len(matrix)
        n = len(matrix[0])

        top, bottom, left, right = 0, m - 1, 0, n - 1

        result = []

        while top <= bottom and left <= right: # once goes out of the this condition we have traversed all the elements in the matrix

            for i in range(left, right + 1):
                result.append(matrix[top][i]) # moved till the end of the top row
            top += 1 # the new top will be 1+ the previous top, as we already parsed the top elemenst the new top will be 1+ 

            for i in range(top, bottom + 1): # next moved till the bottom of thr right col
                result.append(matrix[i][right]) 
            right -= 1 # the new right will be -1 as the most right coloum is traversed the new right is -1 of the previous right

            if top <= bottom: # we have increased the top after the 1st for loop so have to check by increasing is it less than or equal to bottom , before traversing
                for i in range(right, left - 1, -1): # move till the left of the bottom row
                    result.append(matrix[bottom][i])
                bottom -= 1 # covered the last bottom the new bottom will be 1 up so bottom-=1

            if left <= right: # last direction is 
                for i in range(bottom, top - 1, -1): # move till the top of the left col
                    result.append(matrix[i][left])
                left += 1

        return result
