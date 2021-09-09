class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        nums_rows, nums_cols = len(mat), len(mat[0])
        
        diag = [[] for _ in range(nums_rows + nums_cols - 1)]
        
        for i in range(nums_rows):
            for j in range(nums_cols):
                diag[i+j].append(mat[i][j])
                
        result = diag[0]
        
        for x in range(1, len(diag)):
            if x % 2 == 1:
                result.extend(diag[x])
            else:
                result.extend(diag[x][::-1])
                
        return result