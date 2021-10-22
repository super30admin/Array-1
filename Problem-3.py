# 54. Spiral Matrix
# https://leetcode.com/problems/spiral-matrix/

# Time complexiety: O(nm)
# Space complexiety: O(1)

class Solution:
    def spiralOrder(self, matrix):
        res = []
        n = len(matrix)
        m = len(matrix[0])

        left = 0
        right = m-1
        top = 0
        bottom = n-1

        while len(res) < n*m:
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top += 1

            for i in range(top,bottom+1):
                res.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
                left += 1
        return res

obj = Solution()
print(obj.spiralOrder([[1,2,3],[4,5,6],[7,8,9]])==[1,2,3,6,9,8,7,4,5])
print(obj.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]])==[1,2,3,4,8,12,11,10,9,5,6,7])