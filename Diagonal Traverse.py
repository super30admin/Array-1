# Time Complexity : O(m * n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
def findDiagonalOrder(mat):
    if mat == None or len(mat) == 0:
        return []
    m = len(mat)
    n = len(mat[0])
    result = [None] * (m*n)
    r = 0
    c = 0
    dir= 1
    idx = 0
    while idx < len(result):
        result[idx] = mat[r][c]
        idx += 1
        
        #up
        if(dir==1):
            if c == n-1:
                r += 1
                dir = -1
            elif r == 0:
                c += 1
                dir = -1
            else:
                r -= 1
                c += 1
                
        else:
            if r == m-1:
                c += 1
                dir = 1
            elif c == 0:
                r += 1
                dir = 1
            else:
                c -= 1
                r += 1
    return result

mat = [[1,2,3],[4,5,6],[7,8,9]]
print(findDiagonalOrder(mat))