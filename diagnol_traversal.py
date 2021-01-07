# Approach:
# We need to define the edge cases for when we traverse up and downwards 
# Time : O(M * N)
# Space : O(1)           



def findDiagonalOrder(matrix):

    if not matrix:
        return []

    rows = len(matrix)
    cols = len(matrix[0])

    result = []
    i = j = 0
    direction = 1 # Initialized to 1 as we want to move from (0,0)

    while i < rows and j < cols:

        if direction == 1:

            if j == cols - 1:
                # if at last column , move to next row and move downwards
                i += 1
                direction = -1

            elif i == 0:
                # if at first row then we need to move to next col value and then downwards
                j += 1
                direction  = -1


            else: # apart from above 2 boundary conditions
                i -= 1
                j += 1

        else: # mirror implementation

            if i == rows - 1:
                j += 1
                direction = 1

            
            elif j == 0:
                i += 1
                direction = 1


            else:
                i += 1
                j -= 1

    return result

