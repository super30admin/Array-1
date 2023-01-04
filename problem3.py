#time O(mn)
#space O(n)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        d = collections.defaultdict(list)
        for i in range(m):
            for j in range(n):
                d[(i+j)].append(mat[i][j])
        
        res = []
        for key in d:
            if key%2 == 0:
                res += reversed(d[key])
            else:
                res += d[key]
        
        return res