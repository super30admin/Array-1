# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution(object):
    def spiralOrder(self, matrix):
        if len(matrix) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        spiral_arr = []
        while(top <= bottom and left <= right):
            #moving left to right
            for i in range(left, right+1):
                spiral_arr.append(matrix[top][i])
            top = top + 1
            #moving top to bottom
            for i in range(top, bottom+1):
                spiral_arr.append(matrix[i][right])
            right = right - 1
            #moving from right to left
            if (top <= bottom):
                for i in range(right, left-1, -1):
                    spiral_arr.append(matrix[bottom][i])
                bottom = bottom - 1
            #moving from bottom to top
            if(left <= right):
                for i in range(bottom, top-1, -1):
                    spiral_arr.append(matrix[i][left])
                left = left + 1
        return spiral_arr
    
obj = Solution()
sol1 = obj.spiralOrder([[1,2,3],[4,5,6],[7,8,9]])
print(sol1)
sol2 = obj.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]])
print(sol2)
        