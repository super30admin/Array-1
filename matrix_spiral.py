#Time Complexity O(N^2)
#Space Complexity O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        rows = len(matrix)
        cols = len(matrix[0])
        result = []
        top , left = 0 , 0
        bottom = rows - 1
        right = cols - 1

        while (top <= bottom) and (left <= right):

            #Move from left to right of top row
            if (top <= bottom) and (left <= right):

                for i in range(left , right + 1):
                    result.append(matrix[top][i])
                top = top + 1

            #move from top to bottom of right col
            if (top <= bottom) and (left <= right):

                for i in range (top , bottom + 1):
                    result.append(matrix[i][right])
                right = right - 1


            # move from right to left of bottom row
            if (top <= bottom) and (left <= right):

                for i in range(right , left - 1 , -1):
                    result.append(matrix[bottom][i])
                bottom = bottom - 1

            # move from bottom to up of left col
            if (top <= bottom) and (left <= right):

                for i in range(bottom , top - 1, -1):
                    result.append(matrix[i][left])
                left = left + 1

        
        return result




