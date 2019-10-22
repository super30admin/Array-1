# time - O(M*N), space - O(1) without considering output array.
# accepted in leetcode
# As we have to return the elements of matrix in spiral fashion, here we use 4 pointers to achieve that.
class Solution:
    def spiralOrder(self, matrix):

        result = []
        left = top = 0
        if len(matrix) == 0 or matrix is None: # handling edge case
            return result
        n = len(matrix)
        m = len(matrix[0])
        right = m - 1
        bottom = n - 1

        while top <= bottom and left <= right: # checking for exit conditions
            #  this loop returns all top row elements
            for i in range(left, right + 1):
                result.append(matrix[top][i])
                # print(matrix[top][i])
            top = top + 1
            # returns right column elements
            if left <= right:
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
                    # print(matrix[i][right])
            right = right - 1
            # returns bottom row elements
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                    # print("bottom: ",matrix[bottom][i],i)
            bottom = bottom - 1
            # returns left column elements
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                    # print("left",matrix[i][left])
            left = left + 1
        return result

s = Solution()

print(s.spiralOrder([[1,2,3,4,5],[4,5,3,5,6],[6,5,8,9,8],[1,4,3,7,8],[2,3,4,56,6]]))