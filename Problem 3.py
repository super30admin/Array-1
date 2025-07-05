class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return 0
        out = []

        cb = 0
        rb = 0
        ce = len(matrix[0]) - 1
        re = len(matrix) - 1

        while cb <= ce and rb <= re:
            for i in range (cb, ce+1):
                out.append(matrix[rb][i])
            rb+= 1
            
            for j in range (rb, re+1):
                out.append(matrix[j][ce])
            ce-=1

            if rb<=re:
                for i in range (ce, cb-1, -1):
                    out.append(matrix[re][i])
                re-=1

            if cb<=ce:
                for j in range (re, rb-1, -1):
                    out.append(matrix[j][cb])
                cb+=1
        
        return out


        
