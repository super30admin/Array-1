#  Time Complexity : O(m*n)
# Space Complexity :O(m*n)
# Leet Code: Yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left = 0
        right = len(matrix[0])
        top = 0
        bottom = len(matrix)
        arr = [None for _ in range(right*bottom)]
        idx = 0
        while (left <= right-1) and (top <= bottom-1):
            
            for i in range(left, right):

                arr[idx] = matrix[top][i]
                idx += 1
            top += 1
            
            if(top <= bottom-1 and left <= right-1):
                for i in range(top, bottom):
                    arr[idx] = matrix[i][right-1]
                    idx += 1
                right -= 1

            if(top <= bottom-1 and left <= right-1):
                for i in range(right-1, left-1, -1):
                    arr[idx] = matrix[bottom-1][i]
                    idx += 1
                bottom -= 1
            
            if(top <= bottom-1 and left <= right-1):
                for i in range(bottom-1, top-1, -1):
                    arr[idx] = matrix[i][left]
                    idx += 1
                left += 1
        
        return arr