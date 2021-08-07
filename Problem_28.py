
def isInBounds(i, j):
    global R
    global C
    if (i < 0 or i >= R or j < 0 or j >= C):
        return False
    return True
 
 
 
def isBlocked(matrix, i, j):
    if (not isInBounds(i, j)):
        return True
    if (matrix[i][j] == -1):
        return True
 
    return False
 
 
 
def spirallyDFSTravserse(matrix, i, j, Dir, res):
    if (isBlocked(matrix, i, j)):
        return
 
    allBlocked = True
    for k in range(-1, 2, 2):
        allBlocked = allBlocked and isBlocked(
            matrix, k + i, j) and isBlocked(matrix, i, j + k)
 
    res.append(matrix[i][j])
    matrix[i][j] = -1
    if (allBlocked):
        return
 
   
    nxt_i = i
    nxt_j = j
    nxt_dir = Dir
    if (Dir == 0):
        if (not isBlocked(matrix, i, j + 1)):
            nxt_j += 1
        else:
            nxt_dir = 1
            nxt_i += 1
 
    elif(Dir == 1):
        if (not isBlocked(matrix, i + 1, j)):
            nxt_i += 1
        else:
            nxt_dir = 2
            nxt_j -= 1
 
    elif(Dir == 2):
        if (not isBlocked(matrix, i, j - 1)):
            nxt_j -= 1
        else:
            nxt_dir = 3
            nxt_i -= 1
 
    elif(Dir == 3):
        if (not isBlocked(matrix, i - 1, j)):
            nxt_i -= 1
        else:
            nxt_dir = 0
            nxt_j += 1
 
    spirallyDFSTravserse(matrix, nxt_i, nxt_j, nxt_dir, res)
 

 
 
def spirallyTraverse(matrix):
    res = []
    spirallyDFSTravserse(matrix, 0, 0, 0, res)
    return res
 
 

a = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
 

res = spirallyTraverse(a)
print(*res)
 
