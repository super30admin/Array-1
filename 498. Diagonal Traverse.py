"""
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

 

Example:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]
"""
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:   
        # Put a direction which indicates the exact direction we are moving.
        # follow the edge cases and traverse and append it to the result.
        #Run Time complexity: O(M*N)
        #Space Complexity: O(1)
        if not matrix or not matrix[0]:
            return []
        N, M = len(matrix), len(matrix[0])
        row, column = 0, 0
        direction = 1
        result = []
        while row < N and column < M:
            result.append(matrix[row][column])
            new_row = row + (-1 if direction == 1 else 1)
            new_column = column + (1 if direction == 1 else -1)
            if new_row < 0 or new_row == N or new_column < 0 or new_column == M:
                if direction:
                    row += (column == M - 1)
                    column += (column < M - 1)
                else:
                    column += (row == N - 1)
                    row += (row < N - 1)
                direction = 1 - direction        
            else:
                row = new_row
                column = new_column
                        
        return result                 