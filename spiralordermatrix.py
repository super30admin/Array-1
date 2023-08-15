class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)
        m = len(matrix[0])

        left = 0
        right = n-1
        top = 0
        bottom = m-1

        result = [-1]
        
        while(top<=bottom and left<=right):

            for j in range(0,right):
                result.append(matrix[top][j])
            top += 1

            if top<=bottom and left<=right:
                for i in range(top,bottom):
                    result.append(matrix[top][right])
            right -= 1

            if top<=bottom and left<=right:
                for j in range(right,left,-1):
                    result.append(matrix[bottom][j-1])
            bottom -= 1

            if top<=bottom and left<=right:
                for i in range(bottom,top,-1):
                    result.append(matrix[i-1][left])
            left += 1    

        return result[1:]



