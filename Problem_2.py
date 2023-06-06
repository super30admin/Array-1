# Time Complexity: O(m * n)
# Space Complexity: O(m * n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if mat == []: return []
        ans = []
        row,col = len(mat), len(mat[0])
        if row == 1: return mat[0]
        for num in range(row + col):
            if (num % 2) == 0:
                for i in range(num + 1):
                    if i >= col:
                        break
                    if (num - i) >= row:
                        continue
                    ans.append(mat[num - i][i])
            else:
                for i in range(num + 1):
                    if i >= row:
                        break
                    if (num - i) >= col:
                        continue
                    ans.append(mat[i][num - i])
        return ans