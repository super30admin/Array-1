##Time Complexity : O(m*n)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        if not mat or not mat[0]: return []
        dir = [(-1, 1), (1, -1)]
        count = 0
        result = []
        i, j = 0, 0
        m, n = len(mat), len(mat[0])
        while len(result) < m*n:
            if 0 <= i <m and 0<=j<n:
                result.append(mat[i][j])
                direct = dir[count % 2]
                i, j = i + direct[0], j + direct[1]
                continue
            elif i<0 and 0<=j<n:
                i +=1
            elif 0<=i<m and j<0:
                j += 1
            elif i<m and j>=n:
                i+=2
                j -=1
            elif i>=m and j<n:
                j+=2
                i-=1
            count += 1
        return result
            
        