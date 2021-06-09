# Reference Video: https://youtu.be/BdQ2AkaTgOA
# Time Complexity:O(mxn)
# Space Complexity:O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        arr = []
        size = len(matrix) * len(matrix[0])
        top = 0
        left = 0
        bottom = len(matrix) - 1
        right = len(matrix[0]) - 1
        #condition is top<=bottom and left <= right
        #this condition has to checked everytime as the pointers are incremented and decremented
        while (len(arr) < size):
            #top row
            for i in range(left, right + 1):
                arr.append(matrix[top][i])
            top += 1
            #right column
            if (len(arr) < size):
                for i in range(top, bottom + 1):
                    arr.append(matrix[i][right])
            right -= 1
            #bottom row
            if (len(arr) < size):
                for i in range(right, left - 1, -1):
                    arr.append(matrix[bottom][i])
            bottom -= 1
            #left column
            if (len(arr) < size):
                for i in range(bottom, top - 1, -1):
                    arr.append(matrix[i][left])
            left += 1
        
        return arr
                
            
            
                