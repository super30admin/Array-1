class Solution:
    def spiralOrder(self, mat: List[List[int]]) -> List[int]:
        l, r, t, b = 0, len(mat[0]), 0, len(mat)
        res = []
        N = r*b

        while l<r and t<b:

            for i in range(l, r):
                res.append(mat[t][i])
            
            t+=1

            for i in range(t, b):
                res.append(mat[i][r-1])
               
            r -= 1

            if t<b:# Make sure we are now on a different row.
                for i in range(r-1, l-1, -1):
                    res.append(mat[b-1][i])
                
            b -= 1

            if l<r:# Make sure we are now on a different column.
                for i in range(b-1, t-1, -1):
                    res.append(mat[i][l])
                
            l += 1
        
        return res
            
