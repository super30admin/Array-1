# Approach: We need to set 4 boundaries, toop bottom, left & right which defines the limits/boundaries of the matrix as we traverse them in spiral manner
# Time Complexity: O(M * N) where M and N are the row and columns or matrix
# Space : O(1) constant as no aux space is used and we return resultant array as output

def spiralOrder(matrix):

    if ((not matrix)):
        return []

    if len(matrix) == 1 and matrix[0] == []:
        return []

    result = []
    top = 0
    bottom = len(matrix) - 1
    left = 0
    right = len(matrix[0]) - 1

    while top <= bottom and left <= right:

        if top <= bottom and left <= right:
            for idx in range(left, right + 1):
                result.append(matrix[top][idx])
            top += 1

        
        if top <= bottom and left <= right:

            for idx in range(top, bottom + 1):
                result.append(matrix[idx][right])
            right -= 1

        if top <= bottom and left <= right:
            
            for idx in range(right, left-1, -1):
                result.append(matrix[bottom][idx])
            bottom -= 1

        if top <= bottom and left <= right:

            for idx in range(bottom, top -1, -1):
                result.append(matrix[idx][left])
            left += 1

    return result