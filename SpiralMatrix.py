#Time Complexity - O(m*n)
#Space Complexity - O(1)
class Solution:
    def spiralOrder(self, matrix):
        if (matrix == None or len(matrix) == 0):
            return []

        res = []
        left, right = 0, len(matrix[0])
        top, bottom = 0, len(matrix)

        while left < right and top < bottom:
            #all elements in top row
            for i in range(left, right):
                res.append(matrix[top][i])
            top += 1

            #all elements in right column
            for i in range(top, bottom):
                res.append(matrix[i][right - 1]) #Right will be out-of-bound so -1
            right -= 1

            if not (left < right and top < bottom):
                break

            #all elements in bottom row
            for i in range(right - 1, left - 1, -1):
                res.append(matrix[bottom - 1][i])
            bottom -= 1

            #all elements in left column
            for i in range(bottom - 1, top - 1, -1):
                res.append(matrix[i][left])
            left += 1
        
        return res