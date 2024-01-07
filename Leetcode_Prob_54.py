# Problem Title: 54. Spiral Matrix
# Aproach: The idea is to keep track of the first row, last column, last row and first column of the matrix. We keep on appending the first row, last column, last row and first column in the result list and keep on removing the elements from the matrix. We keep on doing this until the matrix is empty.
# Time Complexity: O(m*n)
# Space Complexity: O(1)
def spiral_order(matrix):
    result = []
    
    while matrix:
        # Append the first row
        result += matrix.pop(0)
        
        # Append the last column
        if matrix and matrix[0]:
            for row in matrix:
                result.append(row.pop())
        
        # Append the last row in reverse order
        if matrix:
            result += matrix.pop()[::-1]
        
        # Append the first column in reverse order
        if matrix and matrix[0]:
            for row in matrix[::-1]:
                result.append(row.pop(0))
    
    return result
