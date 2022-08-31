#tc: O(m*n)
#sc: O(1)

class Solution:
    def spiralOrder(self, matrix):
        m = len(matrix)
        n = len(matrix[0])
        left, right, top, bottom = 0, n-1, 0, m-1
        res = []
        while top <= bottom and left <= right:
            # top row
            if top <= bottom and left <= right:
                for j in range(left,right+1):
                    res.append(matrix[top][j])
                top += 1
            
            # right wall
            if top <= bottom and left <= right:
                for i in range(top,bottom+1):
                    res.append(matrix[i][right])
                right -= 1
            
            #bottom wall
            if top <= bottom and left <= right:
                for j in range(right,left-1,-1):
                    res.append(matrix[bottom][j])
                bottom -= 1
            
            #left wall
            if top <= bottom and left <= right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
                left += 1
        return res

obj = Solution()
print(obj.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))