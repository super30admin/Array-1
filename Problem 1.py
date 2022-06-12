#time complexity = O(n*n)
#space complexity = O(n)
from collections import defaultdict


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        R, C = len(mat), len(mat[0])

        diagDict = defaultdict(list)

        for r in range(R):
            for c in range(C):
                diagDict[r + c].append(mat[r][c])

        ans = []

        for i, values in enumerate(diagDict.values()):
            if i % 2 == 0:
                ans = ans + values[::-1]
            else:
                ans = ans + values

        return ans