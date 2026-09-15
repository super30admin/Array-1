# Time Complexity : O(mxn)
# Space Complexity :O(mxn) / O(1) auxialiry space
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : 

# Your code here along with comments explaining your approach

def diagonalTraverse(matrix: List[List[int]]) -> List[int]:
    if not matrix:
        return []

    rows = len(matrix)
    cols = len(matrix[0])

    row = 0
    col = 0

    result = []
    going_up = True

    while len(result) < rows * cols:
        # append the current element 
        result.append(matrix[row][col])

        if going_up: 
            # handle edge casses 
            #hitting top boundery 
            if row == 0 and col != cols -1: 
                col += 1
                going_up = False

            #hitting right boundary 
            elif col == cols-1:
                row += 1
                going_up = False 
            else: 
                row -= 1
                col += 1
        
        else: 
            #handling edge cases 
            #left boundary 
            if col == 0 and row != rows -1: 
                row += 1
                going_up = True 

            #bottom boundary 
            elif row == rows -1:
                col += 1
                going_up = True
            else:
                row += 1
                col -= 1
    return result

import unittest

class TestDiagonalTraverse(unittest.TestCase):
    def test_diagonal_traverse(self):
        matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        self.assertEqual(diagonalTraverse(matrix), [1, 2, 4, 7, 5, 3, 6, 8, 9])

if __name__ == '__main__':
    unittest.main()
