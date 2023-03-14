# Time Complexity - O(mn)
# Space Complexity - O(1)



class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        left = 0
        bottom = m-1
        right = n-1
        result = []

        while left <= right and top <= bottom :

            for i in range(left,right+1):
                result.append(matrix[top][i])
            top += 1 
            

            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right -= 1 

            if top <= bottom :

                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom -= 1 

            if left <= right: 

                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left += 1 
        return result
