# Time Complexity: O(mn), where m and n are the dimensions of the matrix
# Space Complexity: O(1), We only use the result array and 4 variables to keep track of the extent of the matrix we have observed
def spiralOrder(matrix: list[list[int]]) -> list[int]:
    if not matrix or not len(matrix):
        return []
    m = len(matrix)
    n = len(matrix[0])
    result = []
    top, right, bottom, left = 0, n-1, m-1, 0
    while top <= bottom and left <= right:
        #  L -> R
        for i in range(left, right+1):
            result.append(matrix[top][i])
        top+=1
        #  T -> B
        for i in range(top, bottom+1):
            result.append(matrix[i][right])
        right-=1
        # R -> L
        if top <= bottom:
            for i in range(right, left-1, -1):
                result.append(matrix[bottom][i])
            bottom-=1
        # B -> T
        if left <= right:
            for i in range(bottom, top-1, -1):
                result.append(matrix[i][left])
            left+=1
    return result