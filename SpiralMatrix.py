class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top =0
        left = 0
        bottom = len(matrix) - 1
        right = len(matrix[0]) - 1
        direction = 0
        arr = []
        while(left<= right and top<= bottom):
            if direction == 0:
                i = left
                while(i<=right):
                    arr.append(matrix[top][i])
                    i = i +1
                top = top +1
            if direction == 1:
                i = top
                while(i<= bottom):
                    arr.append(matrix[i][right])
                    i = i +1
                right = right - 1
            if direction == 2:
                i = right
                while(i>= left):
                    arr.append(matrix[bottom][i])
                    i = i - 1
                bottom = bottom - 1
            if direction == 3:
                i = bottom
                while(i>= top):
                    arr.append(matrix[i][left])
                    i = i - 1
                left = left + 1 
            direction = (direction + 1)%4
        return arr
                
        