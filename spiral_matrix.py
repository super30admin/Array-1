class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
# #         O(m.n)--->TC
# O(1)
           
        res = []
        if not matrix or not matrix[0]:
            return res
        m, n = len(matrix), len(matrix[0])
        l, r, u, d = 0, n - 1, 0, m - 1
        while l <= r and u <= d:
            for j in range(l, r + 1):
                res.append(matrix[u][j])
            for i in range(u + 1, d):
                res.append(matrix[i][r])
            for j in range(r, l - 1, -1):
                res.append(matrix[d][j])
            for i in range(d - 1, u, -1):
                res.append(matrix[i][l])
            l, r, u, d = l + 1, r - 1, u + 1, d - 1
        return res[:m * n]
                