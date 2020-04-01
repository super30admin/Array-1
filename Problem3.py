# Time Complexity = O(n) (n = number of elements)
# Space Complexity = O(1) (result array not counted)
# Works on leetcode

def spiralOrder(matrix):
    if len(matrix) == 0 or len(matrix[0]) == 0:
        return []
    l = 0
    r = len(matrix[0])-1
    u = 0
    d = len(matrix)-1
    res = []
    el = 0
    while(l <= r and u <= d):
        for i in range(l, r+1):
            res.append(matrix[u][i])
        u += 1
        for i in range(u, d+1):
            res.append(matrix[i][r])
        r -= 1
        if u > d or l > r:
            break
        for i in range(r, l-1, -1):
            res.append(matrix[d][i])
        d -= 1
        for i in range(d, u-1, -1):
            res.append(matrix[i][l])
        l += 1
    return res
