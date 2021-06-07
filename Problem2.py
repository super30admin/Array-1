# Time Complexity : O(m*n) m rows and n columns
# Space Complexity : O(n+m)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#adding x and y index and grouping them with value if value is even then reverse else append directly
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        a = {}
        rows = len(mat)
        columns = len(mat[0])
        for i in range(rows):
            for j in range(columns):
                if i+j in a:
                    a[i+j].append(mat[i][j])
                else:
                    a[i+j] = [mat[i][j]]
        out = []
        for i in range(rows+columns-1):
            if i % 2 == 0:
                out += a[i][::-1]
            else:
                out += a[i]
        return out