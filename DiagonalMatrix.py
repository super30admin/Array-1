'''Time Complexity: O(mn) O(number of rows * number of column)
Space Complexity : O(1)'''
def findDiagonalOrder(self, matrix):
    if matrix ==None or len(matrix)==0:
        return []
    m = len(matrix)
    n = len(matrix[0])
    length = m*n
    i,j = 0,0
    direction = 1
    output = [None]*length
    for index in range(length):
        output[index] = matrix[i][j]
        if direction == 1:
            if j == n-1:
                direction = -1
                i = i + 1
            elif i ==0:
                direction = -1
                j = j + 1
            else:
                i  = i - 1
                j  = j + 1
        else:
            if i == m-1:
                direction = 1
                j = j+1
            elif j==0:
                direction = 1 
                i = i + 1
            else:
                i = i + 1
                j = j - 1
    return output