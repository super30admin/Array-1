'''
Time complexity:O(M*N)
Space complexity :O(M*N)
'''
class Solution:
    def diagonal_order(self,matrix):
        res = []

        h = len(matrix)
        if h < 1:
            return res
        w = len(matrix[0])
        
        top = 0
        bottom = h - 1
        left = 0
        right = w - 1

        while top <= bottom and left <= right:
            l = left
            while l <= right:
                res.append(matrix[top][l])
                l += 1
            top += 1

            t = top
            while t <= bottom: 
                res.append(matrix[t][right])
                t += 1
            right -= 1

            r = right
            while r >= left and top <= bottom:
                res.append(matrix[bottom][r])
                r -= 1
            bottom -= 1

            b = bottom
            while b >= top and left <= right:
                res.append(matrix[b][left])
                b -= 1
            left += 1

        return res

s = Solution()
print(s.diagonal_order([[1,2,3],[4,5,6],[7,8,9]]))
