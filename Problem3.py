
#Time complexity : O(M*N)
#Space complexity : O(1)
def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
    res = []
    r,c = len(matrix),len(matrix[0])
    up = left = 0
    right = c - 1
    down = r - 1
    while len(res) < r*c:
        for col in range(left,right+1):
            res.append(matrix[up][col])
        for row in range(up+1,down+1):
            res.append(matrix[row][right])
        if up!=down:
            for col in range(right-1,left-1,-1):
                res.append(matrix[down][col])
        if left!=right:
            for row in range(down-1,up,-1):
                res.append(matrix[row][left])
        left += 1
        right -= 1
        up += 1
        down -= 1
    return res