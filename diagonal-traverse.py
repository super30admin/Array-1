'''

TC: O(n*m)
SC: O(1)

Intuition: have dir parameter and check for edge cases when changing direction
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rlen = len(mat)
        if not rlen:
            return []
        clen = len(mat[0])
        
        dir = 1
        idx, jdx, k = 0, 0, 0
        res = [0 for i in range(rlen * clen)]
        
        while k < rlen*clen:
            res[k] = mat[idx][jdx]
            k += 1
            if dir == 1:
                if jdx == clen -1:
                    idx += 1
                    dir = -1
                elif idx == 0:
                    jdx += 1
                    dir = -1
                else:
                    idx -= 1
                    jdx += 1
            elif dir == -1:
                if idx == rlen -1:
                    jdx += 1
                    dir = 1
                elif jdx == 0:
                    idx += 1
                    dir = 1
                else:
                    idx += 1
                    jdx -= 1

        return res
                
        