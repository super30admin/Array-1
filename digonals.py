class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows,cols=len(mat),len(mat[0])
        diagonals=[[] for _ in range(rows+cols-1)]
        
        for i in range(rows):
            for j in range(cols):
                diagonals[i+j].append(mat[i][j])
        
        res=[]
        for k in range(len(diagonals)):
            if k % 2 !=0:
                res+=diagonals[k]
            else:
                res+=diagonals[k][::-1]
        return res