# TC = O(mn)
# SC = O(1)
# Cyclic traversal - we will be having 4 directions to handle this time. 
class Solution:
    def spiralOrder(self, matrix):
        if not matrix or len(matrix) == 0 : return []
        top,bottom, right, left = 0, len(matrix)-1, len(matrix[0])-1, 0
        res = []
        while top <= bottom and left <= right:
            # top row
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top+=1

            # right column
            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right -= 1

            # bottom
            # To make sure the base condition doent break in between a ongoing iteration
            if top> bottom or left > right: break
            for i in range(right,left-1,-1):
                res.append(matrix[bottom][i])
            bottom -= 1

            # left
            for i in range(bottom, top-1,-1):
                res.append(matrix[i][left])
            left += 1

        return res

obj = Solution()
matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(obj.spiralOrder(matrix))