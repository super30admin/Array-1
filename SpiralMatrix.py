#time complexity : O(m*n)
#space complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        result=[]
        left, top = 0,0
        right = n-1
        bottom = m-1
        row,column = 0,0 
       
        while left <= right and top<=bottom:    
            for column in range(left, right+1):
                result.append(matrix[top][column])
            top +=1
        
            if left<=right:
                for row in range(top, bottom+1):
                    result.append(matrix[row][right])

                right -=1

            if top<=bottom:
                for column in range(right, left-1, -1):
                    result.append(matrix[bottom][column])

                bottom -=1

            if left<=right:
                for row in range(bottom, top-1, -1):
                    result.append(matrix[row][left])

                left +=1

        return result
