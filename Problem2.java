class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        entries = [(i+j, (j, i)[(i^j)&1], val)
               for i, row in enumerate(mat)
               for j, val in enumerate(row)]
        return [e[2] for e in sorted(entries)]
