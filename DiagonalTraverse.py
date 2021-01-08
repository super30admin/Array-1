# TC = O(mn)
# SC = O(1)
# Bidirectional traverse: we use a aux variable dir to handle direction. 
def diagonal(matrix):
    if not matrix or len(matrix) == 0: return [0]
    m, n = len(matrix), len(matrix[0])
    res = [0] * (m*n)
    idx, i,j, dir = 0,0,0,1

    while idx < len(res):
        res[idx] = matrix[i][j]
        # bottom-up diagonal
        if dir == 1:
            # if we reach last column element
            if j== n-1:
                i+=1
                dir = -1
            # first row element
            elif i == 0:
                j+=1
                dir = -1
            else:
                i-=1
                j+=1
        else:
            # last row element
            if i == m-1:
                j+=1
                dir = 1
            # first column element
            elif j == 0:
                i+=1
                dir = 1
            else:
                i+=1
                j-=1
        idx += 1
    return res

matrix = [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

print(diagonal(matrix))