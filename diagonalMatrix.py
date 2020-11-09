# As taugnht in class to travel the matrix in diagonal order I defined a direction variable and then based on the direction I move the I aand j pointers to het element
# Time Complexity: O(n)
#Space Complexity: O(n)
def spiral(matrix):
    if matrix is None or len(matrix) == 0:
        return [0]
    m = len(matrix)
    n = len(matrix[0])
    result = [0]*(m*n)
    print(result)
    i = 0
    j = 0
    index = 0
    direction = 1
    while (index < m*n):
        result[index] = matrix[i][j]
        if direction == 1:
            if j == n -1:
                i = i +1
                direction = direction - 1
            elif  i == 0:
                j = j + 1
                direction = direction - 1
            else:
                i = i - 1
                j = j + 1
        else:
            if j == m -1:
                i = i +1
                direction = 1
            elif  j == 0:
                i = i + 1
                direction = direction - 1
            else:
                j = j - 1
                i = i + 1
        index = index + 1


matrix = [[1,2,3]]
spiral(matrix)