"""

    Student : Shahreen Shahjahan Psyche
    Time Complexity : O(MN) [It is traversing through all the elements of the matrix]
    Space Complexity : O(MN) [Using boolean auxiliary space to store whether the index of the matrix is visited or not]

    This code passed all the test cases in Leetcode.


"""


from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        # edge case
        if not matrix:
            return []
        
        # num of rows
        m = len(matrix)
        # num of cols
        n = len(matrix[0])
        # num of elements
        num_elements = m*n
        # directions of travarsing the array
        # To travarse a matrix in spiral, the direction loop will be right, down, left and up. Here we are travarsing the array in clockwise direction
        directions = ['right', 'down', 'left', 'up'] # O(1) Space as the size of this array is fixed
        # intilization of tracking variables
        i, j, k = 0, 0, 0
        # storing whether the index is visited or not
        records = [[False for _ in range(n)] for _ in range(m)]
        # output array 
        res = []
        
        for _ in range(num_elements):
            
            res.append(matrix[i][j])
            records[i][j] = True
            # Travarsing to right direction
            if directions[k] == 'right':
                # if there it is exceeding the boundary or encounters an already visited index, it shifts the direction to the next one
                if j+1 == n or records[i][j+1] == True:
                    k = k+1
                    i = i+1
                else:
                    j = j+1
            elif directions[k] == 'down':
                # if there it is exceeding the boundary or encounters an already visited index, it shifts the direction to the next one
                if i+1 == m or records[i+1][j] == True:
                    k = k+1
                    j = j-1
                else:
                    i = i+1
            elif directions[k] == 'left':
                # if there it is exceeding the boundary or encounters an already visited index, it shifts the direction to the next one
                if j-1 == -1 or records[i][j-1] == True:
                    k = k+1
                    i = i-1
                else:
                    j = j-1
            else:
                # if there it is exceeding the boundary or encounters an already visited index, it shifts the direction to the next one
                if i-1 == -1 or records[i-1][j] == True:
                    k = 0
                    j = j+1
                else:
                    i = i-1
            
        return res
            
        
        
        
        
        