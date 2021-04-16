'''
Approach: Have four walls and travel in each of the four directions in order.
Keep brininging the corresponding walls closer with every iteration and continue doing it till walls cross each other
'''

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix) == 0:
            return []
        
        left_wall = 0
        right_wall = len(matrix[0])-1
        top_wall = 0
        bottom_wall = len(matrix)-1
        spiral_list = []
        direction = 0 # 0: right, 1: down, 2: left, 3: up
        
        while left_wall <= right_wall and top_wall <= bottom_wall:
            
            if direction == 0:
                row_index = top_wall
                for col_index in range(left_wall, right_wall+1):
                    spiral_list.append(matrix[row_index][col_index])
                top_wall += 1
                
            elif direction == 1:
                col_index = right_wall
                for row_index in range(top_wall, bottom_wall+1):
                    spiral_list.append(matrix[row_index][col_index])
                right_wall -=1
            
            elif direction == 2:
                row_index = bottom_wall
                for col_index in reversed(range(left_wall, right_wall+1)):
                    spiral_list.append(matrix[row_index][col_index])
                bottom_wall -=1
                
            else:
                col_index = left_wall
                for row_index in reversed(range(top_wall, bottom_wall+1)):
                    spiral_list.append(matrix[row_index][col_index])
                left_wall +=1
            
            direction = (direction + 1) % 4
            
        return spiral_list

### Complexity Analysis

# Time Complexity: O(MxN) --> Traversing the entire 2D array
# Space Complexity: O(1) --> Other than returning array, we just use pointers
            
        
        