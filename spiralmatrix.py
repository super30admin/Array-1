#https://leetcode.com/problems/spiral-matrix/
## Time O(mxn), Space: O(1) No extra space used and we visit each element in the matrix of mxn once.

class Solution:
    def spiralOrder(self, matrix):
        
        m, n = len(matrix), len(matrix[0])
        top,left,right,bottom = 0, 0, n-1, m-1
        result = []
        idx = 0
        i, j = 0,0
        while top <= bottom and left <= right:
            #left -> right
            for j in range(left, right+1):
                result.append(matrix[top][j])
            top += 1
            
            #top -> bottom
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            
            #right -> left
            if top <= bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1
           
            
            #bottom -> top
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
           
            
        return result
                
            
            
matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
s = Solution()
output = s.spiralOrder(matrix)
print(output)