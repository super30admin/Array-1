#TC:O(M.N)
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        num_rows = len(matrix)
        num_cols = len(matrix[0])
        diag=[[]for _ in range(num_rows+num_cols-1)]
        
        for i in range(num_rows):
            for j in range(num_cols):
                diag[i+j].append(matrix[i][j])
        res = diag[0]
        for x in range(1,len(diag)):
            if x%2==1:
                res.extend(diag[x])
            else:
                res.extend(diag[x][::-1])
        return res