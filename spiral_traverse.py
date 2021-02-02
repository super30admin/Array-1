# O(M * N) TIME AND O(1) SPACE
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left = 0
        right = len(matrix[0]) - 1
        top = 0
        bottom = len(matrix) - 1
        spiral_order = []
        while(left <= right and top <= bottom):
            for i in range(left,right+1):
                spiral_order.append(matrix[top][i])
            top += 1
            
            for i in range(top,bottom + 1):
                spiral_order.append(matrix[i][right])
            right -= 1
            
            if left <= right and top <= bottom:
                for i in reversed(range(left,right+1)):
                    spiral_order.append(matrix[bottom][i])
                bottom -= 1

                for i in reversed(range(top,bottom + 1)):
                    spiral_order.append(matrix[i][left])
                left += 1
        return spiral_order