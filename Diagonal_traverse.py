class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []

        rows= len(mat)
        cols= len(mat[0])
        diag= [[] for _ in range(rows+cols-1)]

        for i in range(rows):
            for j in range(cols):
                diag[i+j].append(mat[i][j])
        
        res= diag[0]

        for x in range(1, len(diag)):
            if x%2==1:
                res.extend(diag[x])
            else:
                res.extend(diag[x][::-1])
        
        return res
