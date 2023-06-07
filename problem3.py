#Time Complexity : O(n) ... n is number of elements 
#Space Complexity : O(n)
#Any problem you faced while coding this : no

#used top, bottom, left and right boundaries to redirect the order

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        row_len = len(matrix)
        col_len = len(matrix[0])
        top, left = 0, 0
        bottom, right = row_len - 1, col_len - 1
        result = []

        while(top <= bottom and left <= right):
            for j in range(left, right+1):
                result.append(matrix[top][j])
            top += 1
            if(top <= bottom and left <= right):
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
            if(top <= bottom and left <= right):
                for j in reversed(range(left, right+1)):
                    result.append(matrix[bottom][j])
                bottom -= 1
            if(top <= bottom and left <= right):
                for i in reversed(range(top, bottom+1)):
                    result.append(matrix[i][left])
                left += 1

        return result